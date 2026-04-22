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
        String sentenciaSQL9 = "SELECT nombre, apellido FROM Estudiantes JOIN casa ON id_casa.Estudiantes WHERE anyo_curso = 5 AND nombre_casa = 'Gryffindor' OR 'Slytherin'  ";
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

        //SENTENCIA  10
        String sentenciaSQL10 = "SELECT * FROM estudiantes ORDER BY fecha_nacimiento LIMIT 5";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/anavicianofabregat");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL10)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                String fecha_nacimiento = resultados.getString("fecha_nacimiento");
                System.out.println("nombre: " + nombre + ", apellido: " + apellido + ", fecha_nacimiento: " + fecha_nacimiento);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //SENTENCIA  11
        String sentenciaSQL11 = "SELECT nombres FROM estudiantes_Asignatura JOIN Asignatura ON id_asignatura.Estudiante_asignatura = id_asignatura.Asignatura WHERE nombre_asignatura = 'Vuelo' AND calificacion >= 8";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/anavicianofabregat");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL11)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                System.out.println("nombre: " + nombre);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //SENTENCIA  12
        String sentenciaSQL12 = "INSERT INTO estudiante (nombre, apellido, id_casa, anyo_curso, fecha_nacimiento) VALUES (Nymphadora, Tonks, 4, 7,1973-11-25) ";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/anavicianofabregat");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL12)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                int id_casa = resultados.getInt("id_casa");
                int anyo_curso = resultados.getInt("anyo_curso");
                String fecha_nacimiento = resultados.getString("fecha_nacimiento");
                System.out.println("nombre: " + nombre + "apellido: " + apellido + "id_casa: " + id_casa + "anyo_curso: " + anyo_curso + "fecha_nacimiento: " + fecha_nacimiento);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        //SENTENCIA  13
        String sentenciaSQL13 = ("UPDATE casa SET id_jefe = (SELECT id_profesor FROM Profesor WHERE nombre = 'Pomona' AND apellido = 'Sprout') WHERE nombre_casa = 'Hufflepuff' ");
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/anavicianofabregat");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL13)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                System.out.println("nombre: " + nombre + "apellido: " + apellido);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //SENTENCIA  14
        String sentenciaSQL14 = ("DELETE FROM estudiante WHERE nombre = 'Tom' AND apellido = 'Riddle' ");
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/anavicianofabregat");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL14)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                System.out.println("nombre eliminado: " + nombre +  "apellido: " + apellido);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //SENTENCIA  15
        String sentenciaSQL15 = ("SELECT nombre.Estudiante, apellidos.Estudiante, nombre.Casa FROM Estudiante JOIN Casa ON id_casa.Estudiante = id_casa.Casa");
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/anavicianofabregat");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL15)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                System.out.println("nombre eliminado: " + nombre +  "apellido: " + apellido);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //SENTENCIA  16
        String sentenciaSQL16 = ("");
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/anavicianofabregat");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL16)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                System.out.println("nombre eliminado: " + nombre +  "apellido: " + apellido);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

