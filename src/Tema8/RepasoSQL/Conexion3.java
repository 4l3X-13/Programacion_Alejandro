package Tema8.RepasoSQL;

import java.sql.*;

public class Conexion3 {
    public static void main(String[] args) {
        String sentenciaSQL = "SELECT * FROM Profesor";
        try (Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            System.out.println("\n 1");
            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                System.out.println("Profesores: " + nombre + ", " + apellido);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}