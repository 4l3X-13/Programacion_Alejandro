package Tema8.RepasoSQL;

import java.sql.*;

public class Conexion3 {
    static void main() {
        String sentenciaSQL = ("SELECT * FROM Profesor");
        try (Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/postgres",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                System.out.println("nombre eliminado: " + nombre + "apellido: " + apellido);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
