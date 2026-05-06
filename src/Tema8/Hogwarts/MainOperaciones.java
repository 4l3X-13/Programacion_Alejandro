package Tema8.Hogwarts;

import java.sql.*;

public class MainOperaciones {
    static void main() {
        System.out.println("\n SENTENCIA 1: \n");
        String sentenciaSQL1 = "SELECT nombre, apellido FROM Estudiante WHERE Casa == 'Gryfindor' ";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL1)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String nombre_estudiante = resultados.getString("nombre_estudiante");
                String apellido_estudiante = resultados.getString("apellido_estudiante");
                System.out.println("nombre_estudiante: " + nombre_estudiante + "apellido_estudiante: " + apellido_estudiante);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}

