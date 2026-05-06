package Tema8.RepasoSQL;

import java.sql.*;

public class RepasoSQL {
    public static void main(String[] args) {

        //SENTENCIA 1
        System.out.println("\n SENTENCIA 1: \n");
        String sentenciaSQL1 = "SELECT nombre, apellido FROM Profesor";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts", "postgres", "12345678"); PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL1)) {

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
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts", "postgres", "12345678"); PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL2)) {

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
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts", "postgres", "12345678"); PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL3)) {

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
        String sentenciaSQL4 = "SELECT Casa.nombre, COUNT(id_estudiante) AS cantidad FROM Estudiante JOIN Casa ON Estudiante.id_casa = Casa.id_casa GROUP BY Casa.nombre";

        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts", "postgres", "12345678"); PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL4)) {

            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                int cantidad = resultados.getInt("cantidad");
                String nombreCasa = resultados.getString("nombre");
                System.out.println("Casa: " + nombreCasa + ", Número de estudiantes: " + cantidad);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //SENTENCIA  5
        System.out.println("\n SENTENCIA 5: \n");
        String sentenciaSQL5 = "SELECT AVG(calificacion) AS media, MAX(calificacion) AS maxima FROM Estudiante_Asignatura JOIN Asignatura ON Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura WHERE Asignatura.nombre = 'Pociones';";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts", "postgres", "12345678"); PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL5)) {

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
        System.out.println("\n SENTENCIA 6: \n");
        String sentenciaSQL6 = "SELECT DISTINCT anyo_curso FROM Estudiante";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts", "postgres", "12345678"); PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL6)) {

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
        System.out.println("\n SENTENCIA 7: \n");
        String sentenciaSQL7 = "SELECT nombre, apellido FROM Estudiante WHERE apellido LIKE 'P%';";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts", "postgres", "12345678"); PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL7)) {

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

        //SENTENCIA  8
        System.out.println("\n SENTENCIA 8: \n");
        String sentenciaSQL8 = "SELECT nombre, apellido FROM Estudiante WHERE anyo_curso IN (4, 5)";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts", "postgres", "12345678"); PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL8)) {

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
        System.out.println("\n SENTENCIA 9: \n");
        String sentenciaSQL9 = "SELECT Estudiante.nombre, apellido FROM Estudiante JOIN Casa ON Estudiante.id_casa = Casa.id_casa WHERE anyo_curso = 5 AND Casa.nombre IN ('Gryffindor', 'Slytherin');";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts", "postgres", "12345678"); PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL9)) {

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
        System.out.println("\n SENTENCIA 10: \n");
        String sentenciaSQL10 = "SELECT * FROM Estudiante ORDER BY fecha_nacimiento ASC LIMIT 5";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts", "postgres", "12345678"); PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL10)) {

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
        System.out.println("\n SENTENCIA 11: \n");
        String sentenciaSQL11 = "SELECT Estudiante.nombre FROM Estudiante JOIN Estudiante_Asignatura ON Estudiante.id_estudiante = Estudiante_Asignatura.id_estudiante JOIN Asignatura ON Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura WHERE Asignatura.nombre = 'Vuelo' AND calificacion >= 8;";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts", "postgres", "12345678"); PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL11)) {

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
        System.out.println("\n SENTENCIA 12: \n");
        String sentenciaSQL12 = "INSERT INTO Estudiante (nombre, apellido, id_casa, anyo_curso, fecha_nacimiento) VALUES ('Nymphadora', 'Tonks', 4, 7, '1973-11-25')";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts", "postgres", "12345678"); PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL12)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                int anyo_curso = resultados.getInt("anyo_curso");
                String fecha_nacimiento = resultados.getString("fecha_nacimiento");
                System.out.println("nombre: " + nombre + "apellido: " + apellido + "anyo_curso: " + anyo_curso + "fecha_nacimiento: " + fecha_nacimiento);
            }
        } catch (SQLException e) {
            if ("23505".equals(e.getSQLState())) {
                System.out.println("El registro ya existe, no se ha insertado");
            } else {
                e.printStackTrace();
            }
        }


        //SENTENCIA  13
        System.out.println("\n SENTENCIA 13: \n");
        String sentenciaSQL13 = ("UPDATE Casa SET id_jefe = (SELECT id_profesor FROM Profesor WHERE nombre = 'Pomona' AND apellido = 'Sprout') WHERE nombre = 'Hufflepuff'");
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts", "postgres", "12345678"); PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL13)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                System.out.println("nombre: " + nombre + "apellido: " + apellido);
            }
        } catch (SQLException e) {
            if (e.getMessage().contains("more than one row")) {
                System.out.println("ERROR: hay mas de un profesor con ese nombre.");
            } else if (e.getMessage().contains("violates")) {
                System.out.println("Error de integridad (posiblemente ya estaba asignado).");
            } else {
                System.out.println("ERROR SQL controlado: " + e.getMessage());
            }
        }

        // SENTENCIA 14
        System.out.println("\n SENTENCIA 14: \n");
        String sentenciaSQL14 = "DELETE FROM Estudiante WHERE nombre = 'Tom' AND apellido = 'Riddle'";

        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts", "postgres", "12345678"); PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL14)) {

            // Cambiado a executeUpdate() ya que no devuelve un ResultSet
            int filasBorradas = sentencia.executeUpdate();

            if (filasBorradas > 0) {
                System.out.println("El estudiante Tom Riddle ha sido eliminado correctamente.");
            } else {
                System.out.println("No se encontró ningún estudiante con ese nombre.");
            }

        } catch (SQLException e) {
            System.err.println("Error al eliminar: " + e.getMessage());
        }

        //SENTENCIA  15
        System.out.println("\n SENTENCIA 15: \n");
        String sentenciaSQL15 = ("SELECT Estudiante.nombre, Estudiante.apellido, Casa.nombre FROM Estudiante JOIN Casa ON Estudiante.id_casa = Casa.id_casa");
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts", "postgres", "12345678"); PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL15)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                System.out.println("nombre eliminado: " + nombre + ", apellido: " + apellido);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //SENTENCIA  16
        System.out.println("\n SENTENCIA 16: \n");
        String sentenciaSQL16 = "SELECT Estudiante.nombre, Mascota.nombre, Asignatura.nombre FROM Estudiante left join Mascota on Mascota.id_estudiante = Estudiante.id_estudiante inner join Estudiante_Asignatura on Estudiante_Asignatura.id_estudiante = Estudiante.id_estudiante inner join Asignatura on Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura";
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts", "postgres", "12345678"); PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL16)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String nombre_estudiante = resultados.getString("nombre_estudiante");
                String nombre_mascota = resultados.getString("nombre_mascota");
                String nombre_asignatura = resultados.getString("nombre_asignatura");
                System.out.println("nombre_estudiante: " + nombre_estudiante + "nombre_mascota: " + nombre_mascota + "nombre_asignatura: " + nombre_asignatura);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //SENTENCIA  17
        String sentenciaSQL17 = ("SELECT nombre, apellido FROM Estudiante JOIN Estudiante_Asignatura ON id_estudiante.Estudiante = id_estudiante.Estudiante_Asignatura JOIN Asignatura ON id_asignatura.Estudiante_Asignatura = id_asignatura.Asignatura WHERE nombre_asignatura = 'Encantamientos' AND calificacion > (SELECT AVG (calificacion) FROM Estudiante_Asignatura)");
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts", "postgres", "12345678"); PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL17)) {

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

