package Tema8.RepasoSQL;

import java.sql.*;

public class RepasoSQL {
    public static void main(String[] args) {

        //SENTENCIA 1
        System.out.println("\n SENTENCIA 1: \n");
        String sentenciaSQL1 = "SELECT nombre, apellido FROM Profesor";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL1)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                System.out.println("personas: " + nombre);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        //SENTENCIA 2
        System.out.println("\n SENTENCIA 2: \n");
        String sentenciaSQL2 = "SELECT * FROM Estudiante WHERE fecha_nacimiento > '1980-01-01'";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
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
        System.out.println("\n SENTENCIA 3: \n");
        String sentenciaSQL3 = "SELECT * FROM Estudiante ORDER BY fecha_nacimiento ASC";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
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
        System.out.println("\n SENTENCIA 4: \n");
        String sentenciaSQL4 = "SELECT COUNT(id_estudiante) AS cantidad, nombre FROM Estudiante JOIN Casa ON Estudiante.id_casa = Casa.id_casa GROUP BY nombre";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL4)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String id_estudiantes = resultados.getString("id_estudiantes");
                String nombre = resultados.getString("nombre_casa");
                System.out.println("estudiantes: " + id_estudiantes + ", " + nombre);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //SENTENCIA  5
        String sentenciaSQL5 = "SELECT AVG(calificacion) AS media, MAX(calificacion) AS maxima FROM Estudiante_Asignatura JOIN Asignatura ON Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura WHERE nombre_asignatura = 'Pociones';";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
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
        String sentenciaSQL6 = "SELECT DISTINCT anyo_curso FROM Estudiante";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
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
        String sentenciaSQL7 = "SELECT nombre, apellido FROM Estudiante WHERE apellido LIKE 'P%';";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
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
        String sentenciaSQL8 = "SELECT nombre, apellido FROM Estudiante WHERE anyo_curso IN (4, 5)";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
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
        String sentenciaSQL9 = "SELECT nombre, apellido FROM Estudiante JOIN Casa ON Estudiante.id_casa = Casa.id_casa WHERE anyo_curso = 5 AND nombre_casa IN ('Gryffindor', 'Slytherin');";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
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
        String sentenciaSQL10 = "SELECT * FROM Estudiante ORDER BY fecha_nacimiento ASC LIMIT 5";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
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
        String sentenciaSQL11 = "SELECT nombre FROM Estudiante JOIN Estudiante_Asignatura ON Estudiante.id_estudiante = Estudiante_Asignatura.id_estudiante JOIN Asignatura ON Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura WHERE nombre_asignatura = 'Vuelo' AND calificacion >= 8;";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
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
        String sentenciaSQL12 = "INSERT INTO Estudiante (nombre, apellido, id_casa, anyo_curso, fecha_nacimiento) VALUES ('Nymphadora', 'Tonks', 4, 7, '1973-11-25');";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
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
        String sentenciaSQL13 = ("UPDATE Casa SET id_jefe = (SELECT id_profesor FROM Profesor WHERE nombre = 'Pomona' AND apellido = 'Sprout') WHERE nombre_casa = 'Hufflepuff'");
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
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
        String sentenciaSQL14 = ("DELETE FROM Estudiante WHERE nombre = 'Tom' AND apellido = 'Riddle'");
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL14)) {

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

        //SENTENCIA  15
        System.out.println("\n SENTENCIA 15 \n");
        String sentenciaSQL15 = ("SELECT Estudiante.nombre, Estudiante.apellido, Casa.nombre_casa FROM Estudiante JOIN Casa ON Estudiante.id_casa = Casa.id_casa");
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL15)) {

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

        //SENTENCIA  16
        String sentenciaSQL16 = ("SELECT nombre.Estudiante, nombre.Mascota, nombre.Asignatura ");
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL16)) {

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

        //SENTENCIA  17
        String sentenciaSQL17 = ("SELECT nombre, apellido FROM Estudiante JOIN Estudiante_Asignatura ON id_estudiante.Estudiante = id_estudiante.Estudiante_Asignatura JOIN Asignatura ON id_asignatura.Estudiante_Asignatura = id_asignatura.Asignatura WHERE nombre_asignatura = 'Encantamientos' AND calificacion > (SELECT AVG (calificacion) FROM Estudiante_Asignatura)");
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL17)) {

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

