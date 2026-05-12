package Tema8.Actividades_AADD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PilotsCRUD {

    // Consultas SQL (en inglés como pide la BD)
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

    private static final String SQL_CLASIFICACION_PILOTOS =
            "SELECT d.code, d.forename, d.surname, d.nationality, " +
                    "COALESCE(SUM(r.points), 0) AS total_points " +
                    "FROM drivers d " +
                    "LEFT JOIN results r ON d.driverid = r.driverid " +
                    "GROUP BY d.driverid, d.code, d.forename, d.surname, d.nationality " +
                    "ORDER BY total_points DESC";

    private static final String SQL_CLASIFICACION_CONSTRUCTORES =
            "SELECT c.name, c.nationality, " +
                    "COALESCE(SUM(r.points), 0) AS total_points " +
                    "FROM constructors c " +
                    "LEFT JOIN drivers d ON c.constructorid = d.constructorid " +
                    "LEFT JOIN results r ON d.driverid = r.driverid " +
                    "GROUP BY c.constructorid, c.name, c.nationality " +
                    "ORDER BY total_points DESC";

    // Método auxiliar para no repetir código al leer el ResultSet
    private static Piloto construirPiloto(ResultSet rs) throws SQLException {
        // OJO: Los nombres de las columnas deben ser los de la tabla (driverid, forename, etc)
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

    public static void crearPiloto(Piloto p) throws SQLException {
        Connection con = DatabaseConnection.getInstance().getConnection();
        try (PreparedStatement ps = con.prepareStatement(SQL_INSERT)) {
            ps.setInt(1, p.getId_del_piloto());
            ps.setString(2, p.getCodigo());
            ps.setString(3, p.getNombre());
            ps.setString(4, p.getApellido());
            ps.setString(5, p.getFecha_de_nacimiento());
            ps.setString(6, p.getNacionalidad());
            ps.setString(7, p.getUrl());

            int filas = ps.executeUpdate();
            System.out.println("Piloto guardado. Filas: " + filas);
        }
    }

    public static Piloto leerPiloto(int id) throws SQLException {
        Connection con = DatabaseConnection.getInstance().getConnection();
        try (PreparedStatement ps = con.prepareStatement(SQL_SELECT_BY_ID)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return construirPiloto(rs);
            }
        }
        return null;
    }

    public static List<Piloto> leerTodosLosPilotos() throws SQLException {
        List<Piloto> lista = new ArrayList<>();
        Connection con = DatabaseConnection.getInstance().getConnection();
        try (PreparedStatement ps = con.prepareStatement(SQL_SELECT_ALL)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(construirPiloto(rs));
            }
        }
        return lista;
    }

    public static void actualizarPiloto(Piloto p) throws SQLException {
        Connection con = DatabaseConnection.getInstance().getConnection();
        try (PreparedStatement ps = con.prepareStatement(SQL_UPDATE)) {
            ps.setString(1, p.getCodigo());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getApellido());
            ps.setString(4, p.getFecha_de_nacimiento());
            ps.setString(5, p.getNacionalidad());
            ps.setString(6, p.getUrl());
            ps.setInt(7, p.getId_del_piloto());

            int filas = ps.executeUpdate();
            System.out.println("Piloto actualizado. Filas: " + filas);
        }
    }

    public static void borrarPiloto(int id) throws SQLException {
        Connection con = DatabaseConnection.getInstance().getConnection();
        try (PreparedStatement ps = con.prepareStatement(SQL_DELETE)) {
            ps.setInt(1, id);
            int filas = ps.executeUpdate();
            System.out.println("Piloto borrado. Filas: " + filas);
        }
    }

    public static void mostrarClasificacionPilotos() throws SQLException {
        Connection con = DatabaseConnection.getInstance().getConnection();
        try (PreparedStatement ps = con.prepareStatement(SQL_CLASIFICACION_PILOTOS)) {
            ResultSet rs = ps.executeQuery();

            System.out.println("\n--- CLASIFICACIÓN MUNDIAL DE PILOTOS 2006 ---");
            System.out.printf("%-5s %-25s %-15s %-5s%n", "POS", "PILOTO", "NACIÓN", "PTS");

            int pos = 1;
            while (rs.next()) {
                String nombreCompleto = rs.getString("forename") + " " + rs.getString("surname");
                System.out.printf("%-5d %-25s %-15s %-5d%n",
                        pos++,
                        nombreCompleto,
                        rs.getString("nationality"),
                        rs.getInt("total_points"));
            }
        }
    }

    public static void mostrarClasificacionConstructores() throws SQLException {
        Connection con = DatabaseConnection.getInstance().getConnection();
        try (PreparedStatement ps = con.prepareStatement(SQL_CLASIFICACION_CONSTRUCTORES)) {
            ResultSet rs = ps.executeQuery();

            System.out.println("\n--- CLASIFICACIÓN DE CONSTRUCTORES 2006 ---");
            System.out.printf("%-5s %-20s %-15s %-5s%n", "POS", "EQUIPO", "NACIÓN", "PTS");

            int pos = 1;
            while (rs.next()) {
                System.out.printf("%-5d %-20s %-15s %-5d%n",
                        pos++,
                        rs.getString("name"),
                        rs.getString("nationality"),
                        rs.getInt("total_points"));
            }
        }
    }
}