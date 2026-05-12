package Tema8.Actividades_AADD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PilotsCRUD {

    private static final String SQL_INSERT =
            "INSERT INTO drivers (driverid, code, forename, surname, dob, nationality, url) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?)";

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


    private static Piloto buildPilotFromResultSet(ResultSet rs) throws SQLException {
        return new Piloto(
                rs.getInt("id_del_piloto"),
                rs.getString("codigo"),
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getString("fecha_de_nacimiento"),
                rs.getString("nacionalidad"),
                rs.getString("url")
        );
    }



    public static void CreatePilot(Piloto pilot) throws SQLException {
        Connection conexion = DatabaseConnection.getInstance().getConnection();
        try (PreparedStatement ps = conexion.prepareStatement(SQL_INSERT)) {
            ps.setInt(1, pilot.getId_del_piloto());
            ps.setString(2, pilot.getCodigo());
            ps.setString(3, pilot.getNombre());
            ps.setString(4, pilot.getApellido());
            ps.setString(5, pilot.getFecha_de_nacimiento());           // (YYYY-MM-DD)
            ps.setString(6, pilot.getNacionalidad());
            ps.setString(7, pilot.getUrl());

            int filas = ps.executeUpdate();
            System.out.println(" Piloto insertado correctamente. Filas afectadas: " + filas);
        }
    }



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




    public static List<Piloto> ReadPilots() throws SQLException {
        List<Piloto> pilots = new ArrayList<>();
        Connection conexion = DatabaseConnection.getInstance().getConnection();
        try (PreparedStatement ps = conexion.prepareStatement(SQL_SELECT_ALL)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                pilots.add(buildPilotFromResultSet(rs));
            }
        }
        return pilots;
    }



    public static void UpdatePilot(Piloto pilot) throws SQLException {
        Connection conexion = DatabaseConnection.getInstance().getConnection();
        try (PreparedStatement ps = conexion.prepareStatement(SQL_UPDATE)) {
            ps.setString(1, pilot.getCodigo());
            ps.setString(2, pilot.getNombre());
            ps.setString(3, pilot.getApellido());
            ps.setString(4, pilot.getFecha_de_nacimiento());
            ps.setString(5, pilot.getNacionalidad());
            ps.setString(6, pilot.getUrl());
            ps.setInt(7, pilot.getId_del_piloto());    // WHERE driverid = ?

            int filas = ps.executeUpdate();
            System.out.println("Piloto actualizado correctamente. Filas afectadas: " + filas);
        }
    }



    public static void DeletePilot(Piloto pilot) throws SQLException {
        Connection conexion = DatabaseConnection.getInstance().getConnection();
        try (PreparedStatement ps = conexion.prepareStatement(SQL_DELETE)) {
            ps.setInt(1, pilot.getId_del_piloto());
            int filas = ps.executeUpdate();
            System.out.println("Piloto eliminado correctamente. Filas afectadas: " + filas);
        }
    }


    // CLASIFICACIONES

    public static void ShowPilotClassification() throws SQLException {
        Connection conn = DatabaseConnection.getInstance().getConnection();
        try (PreparedStatement ps = conn.prepareStatement(SQL_PILOT_CLASSIFICATION)) {
            ResultSet rs = ps.executeQuery();

            System.out.println("     CLASIFICACIÓN MUNDIAL DE PILOTOS – F1 2006           ");
            System.out.printf(" %-3s  %-5s  %-22s  %-13s  %s%n",
                    "POS", "COD", "PILOTO", "NACIÓN", "PTS");

            int posicion = 1;
            while (rs.next()) {
                String name = rs.getString("nombre") + " " + rs.getString("apellido");
                System.out.printf(" %-3d  %-5s  %-22s  %-13s  %3d%n",
                        posicion++,
                        rs.getString("codigo"),
                        name,
                        rs.getString("nacionalidad"),
                        rs.getInt("total_puntos")
                );
            }
            System.out.println("+\n");
        }
    }


    public static void buildersClasificacion() throws SQLException {
        Connection conn = DatabaseConnection.getInstance().getConnection();
        try (PreparedStatement ps = conn.prepareStatement(SQL_BUILDERS_CLASSIFICATION)) {
            ResultSet rs = ps.executeQuery();

            System.out.println("  CLASIFICACIÓN DE CONSTRUCTORES – F1 2006    ");
            System.out.printf(" %-3s  %-22s  %-12s  %s%n", "POS", "CONSTRUCTOR", "NACIÓN", "PTS");

            int pos = 1;
            while (rs.next()) {
                System.out.printf(" %-3d  %-22s  %-12s  %3d %n",
                        pos++,
                        rs.getString("nombre"),
                        rs.getString("nacionalidad"),
                        rs.getInt("total_puntos")
                );
            }
            System.out.println("\n");
        }
    }
}