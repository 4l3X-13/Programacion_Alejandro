package Tema8.RepasoSQL;

import java.sql.*;

public class RepasoSQL {
    public static void main(String[] args) {

        //SENTENCIA 1
        String sentenciaSQL1 = "SELECT nombres, apellidos FROM profesores";
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


        //SENTENCIA 2
        String sentenciaSQL2 = "SELECT nombres, apellidos FROM profesores WHERE fecha_nacimiento > 1-01-1980";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/anavicianofabregat");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL2)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                System.out.println("personas: " + nombre + ", " + apellido);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //SENTENCIA 3
        String sentenciaSQL3 = "SELECT nombres, apellidos FROM estudiantes ORDER BY fecha_nacimiento ASCENDENT";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/anavicianofabregat");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL3)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                String fecha_nacimiento = resultados.getString("fecha_nacimiento");
                System.out.println("estudiante: " + nombre + ", " + apellido + ", " + fecha_nacimiento);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        //SENTENCIA 4
        String sentenciaSQL4 = "SELECT count(id_estudiantes) as cantidad, nombre.estudiantes, apellido.estudiantes, id_casa.estudiantes, nombre_casa.estudiantes* estudiantes FROM estudiantes GROUP BY casa ";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/anavicianofabregat");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL4)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String id_estudiantes = resultados.getString("id_estudiantes");
                String nombre_casa = resultados.getString("nombre_casa");
                System.out.println("estudiantes: " + id_estudiantes + ", " + nombre_casa);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //SENTENCIA  5
        String sentenciaSQL5 = "SELECT * AVG(calificacion), Max(calificacion) FROM Estudiante_Asignatura JOIN Asignatura ON id_asignatura.Estudiante_Asignatura = id.asignatura.Asignatura WHERE nombre_asignatura = 'Pociones' ";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/anavicianofabregat");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL5)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String media = resultados.getString("media");
                String maxima = resultados.getString("maxima");
                System.out.println("nota media: " + media + ", nota maxima: " + maxima);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        //SENTENCIA  6
        String sentenciaSQL6 = "SELECT DISTINCT anyo_curso FROM Estudiante  ";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/anavicianofabregat");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL6)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String anyo_curso = resultados.getString("anyo_curso");
                System.out.println("año_curso: " + anyo_curso);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //SENTENCIA  7
        String sentenciaSQL7 = "SELECT nombre,apellido FROM Estudiante WHERE apellido LIKE 'P%' ";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/anavicianofabregat");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL7)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String anyo_curso = resultados.getString("anyo_curso");
                System.out.println("año_curso: " + anyo_curso);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //SENTENCIA  8
        String sentenciaSQL8 = "SELECT nombre, apellido FROM Estudiante WHERE anyo_curso IN (4,5)";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/anavicianofabregat");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL8)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                System.out.println("nombre: " + nombre + ", apellido: " + apellido);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //SENTENCIA  9
        String sentenciaSQL9 = "SELECT nombre, apellido FROM Estudiantes JOIN casa ON id_casa.Estudiantes WHERE anyo_curso (5)  ";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/anavicianofabregat");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL9)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                System.out.println("nombre: " + nombre + ", apellido: " + apellido);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }





    }
}

