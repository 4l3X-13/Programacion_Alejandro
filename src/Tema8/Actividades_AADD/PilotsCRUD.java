package Tema8.Actividades_AADD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PilotsCRUD {

    // SQL centralizadas

    private static final String SQL_INSERT =
            "INSERT INTO drivers (driverid, code, forename, surname, dob, nationality, url) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?)";
    // No insertamos constructorid porque el enunciado pide ignorar esa FK

    private static final String SQL_SELECT_BY_ID =
            "SELECT driverid, code, forename, surname, dob, nationality, url " +
                    "FROM drivers WHERE driverid = ?";

    private static final String SQL_SELECT_ALL =
            "SELECT driverid, code, forename, surname, dob, nationality, url " +
                    "FROM drivers ORDER BY driverid";

    private static final String SQL_UPDATE =
            "UPDATE drivers SET code=?, forename=?, surname=?, dob=?, nationality=?, url=? " +
                    "WHERE driverid=?";

    private static final String SQL_DELETE =
            "DELETE FROM drivers WHERE driverid=?";

    private static final String SQL_PILOT_CLASSIFICATION =
            "SELECT d.driverid, d.code, d.forename, d.surname, d.nationality, " +
                    "       COALESCE(SUM(r.points), 0) AS total_points " +
                    "FROM drivers d " +
                    "LEFT JOIN results r ON d.driverid = r.driverid " +
                    "GROUP BY d.driverid, d.code, d.forename, d.surname, d.nationality " +
                    "ORDER BY total_points DESC";


    private static final String SQL_BUILDERS_CLASSIFICATION =
            "SELECT c.constructorid, c.name, c.nationality, " +
                    "       COALESCE(SUM(r.points), 0) AS total_points " +
                    "FROM constructors c " +
                    "LEFT JOIN drivers d   ON c.constructorid = d.constructorid " +
                    "LEFT JOIN results r   ON d.driverid      = r.driverid " +
                    "GROUP BY c.constructorid, c.name, c.nationality " +
                    "ORDER BY total_points DESC";

    // ─── Método auxiliar privado: ResultSet → Pilot ───────────────────────────

    private static Piloto buildPilotFromResultSet(ResultSet rs) throws SQLException {
        return new Piloto(
                rs.getInt("driverid"),
                rs.getString("code"),
                rs.getString("forename"),
                rs.getString("surname"),
                rs.getString("dob"),
                rs.getString("nationality"),
                rs.getString("url")
        );
    }


    //CREATE

    public static void CreatePilot(Piloto pilot) throws SQLException {
        Connection conn = DatabaseConnection.getInstance().getConnection();
        try (PreparedStatement ps = conn.prepareStatement(SQL_INSERT)) {
            ps.setInt(1, pilot.getDriverId());
            ps.setString(2, pilot.getCode());
            ps.setString(3, pilot.getForename());
            ps.setString(4, pilot.getSurname());
            ps.setString(5, pilot.getDob());           // formato esperado: YYYY-MM-DD
            ps.setString(6, pilot.getNationality());
            ps.setString(7, pilot.getUrl());

            int rows = ps.executeUpdate();
            System.out.println("✓ Piloto insertado correctamente. Filas afectadas: " + rows);
        }
    }


    //READ (uno por ID)

    public static Piloto ReadPilot(int driverId) throws SQLException {
        Connection conn = DatabaseConnection.getInstance().getConnection();
        try (PreparedStatement ps = conn.prepareStatement(SQL_SELECT_BY_ID)) {
            ps.setInt(1, driverId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return buildPilotFromResultSet(rs);
            }
        }
        return null;
    }


    //READ (todos)


    public static List<Piloto> ReadPilots() throws SQLException {
        List<Piloto> pilots = new ArrayList<>();
        Connection conn = DatabaseConnection.getInstance().getConnection();
        try (PreparedStatement ps = conn.prepareStatement(SQL_SELECT_ALL)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                pilots.add(buildPilotFromResultSet(rs));
            }
        }
        return pilots;
    }


    //UPDATE

    public static void UpdatePilot(Piloto pilot) throws SQLException {
        Connection conn = DatabaseConnection.getInstance().getConnection();
        try (PreparedStatement ps = conn.prepareStatement(SQL_UPDATE)) {
            ps.setString(1, pilot.getCode());
            ps.setString(2, pilot.getForename());
            ps.setString(3, pilot.getSurname());
            ps.setString(4, pilot.getDob());
            ps.setString(5, pilot.getNationality());
            ps.setString(6, pilot.getUrl());
            ps.setInt(7, pilot.getDriverId());    // WHERE driverid = ?

            int rows = ps.executeUpdate();
            System.out.println("✓ Piloto actualizado correctamente. Filas afectadas: " + rows);
        }
    }


    //DELETE

    public static void DeletePilot(Piloto pilot) throws SQLException {
        Connection conn = DatabaseConnection.getInstance().getConnection();
        try (PreparedStatement ps = conn.prepareStatement(SQL_DELETE)) {
            ps.setInt(1, pilot.getDriverId());
            int rows = ps.executeUpdate();
            System.out.println("✓ Piloto eliminado correctamente. Filas afectadas: " + rows);
        }
    }


    // CLASIFICACIONES

    public static void ShowPilotClassification() throws SQLException {
        Connection conn = DatabaseConnection.getInstance().getConnection();
        try (PreparedStatement ps = conn.prepareStatement(SQL_PILOT_CLASSIFICATION)) {
            ResultSet rs = ps.executeQuery();

            System.out.println("\n╔══════════════════════════════════════════════════════════╗");
            System.out.println("║     CLASIFICACIÓN MUNDIAL DE PILOTOS – F1 2006           ║");
            System.out.println("╠══════════════════════════════════════════════════════════╣");
            System.out.printf("║ %-3s  %-5s  %-22s  %-13s  %s%n",
                    "POS", "COD", "PILOTO", "NACIÓN", "PTS║");
            System.out.println("╠══════════════════════════════════════════════════════════╣");

            int pos = 1;
            while (rs.next()) {
                String name = rs.getString("forename") + " " + rs.getString("surname");
                System.out.printf("║ %-3d  %-5s  %-22s  %-13s  %3d║%n",
                        pos++,
                        rs.getString("code"),
                        name,
                        rs.getString("nationality"),
                        rs.getInt("total_points")
                );
            }
            System.out.println("+\n");
        }
    }


    public static void ShowBuildersClassification() throws SQLException {
        Connection conn = DatabaseConnection.getInstance().getConnection();
        try (PreparedStatement ps = conn.prepareStatement(SQL_BUILDERS_CLASSIFICATION)) {
            ResultSet rs = ps.executeQuery();

            System.out.println("  CLASIFICACIÓN DE CONSTRUCTORES – F1 2006    ");
            System.out.printf(" %-3s  %-22s  %-12s  %s%n", "POS", "CONSTRUCTOR", "NACIÓN", "PTS");

            int pos = 1;
            while (rs.next()) {
                System.out.printf(" %-3d  %-22s  %-12s  %3d %n",
                        pos++,
                        rs.getString("name"),
                        rs.getString("nationality"),
                        rs.getInt("total_points")
                );
            }
            System.out.println("\n");
        }
    }
}