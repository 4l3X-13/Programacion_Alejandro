package Tema8.RepasoSQL;

import java.sql.*;

public class RepasoSQL {
    public static void main(String[] args) {

        String sentenciaSQL1 = "SELECT nombres, apellidos FROM profesores";
        //opcion 2: PreparedStatement
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/anavicianofabregat");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL1)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String dni = resultados.getString("dni");
                String nombre = resultados.getString("nombre");
                System.out.println("personas: " + dni + ", " + nombre);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        String sentenciaSQL2 = "SELECT nombres, apellidos FROM profesores WHERE fecha_nacimiento > 1-01-1980";
        //opcion 2: PreparedStatement
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/anavicianofabregat");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL2)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String dni = resultados.getString("dni");
                String nombre = resultados.getString("nombre");
                System.out.println("personas: " + dni + ", " + nombre);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

