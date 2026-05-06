package Tema8.RepasoSQL;

import java.sql.*;

public class RepasoSQL {
    public static void main(String[] args) {
        //sentencia 1

        //Saco la consulta fuera, para poderla usar en el PreparedStatement del try
        String sentenciaSQL = "SELECT * FROM Profesor";
        //opcion 2: PreparedStatement
        try (Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            System.out.println("\n sentencia 1:");
            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                System.out.println("Profesores: " + nombre + ", " + apellido);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //sentencia2

        String sentenciaSQL2 = "SELECT * FROM Estudiante WHERE fecha_nacimiento > '1-1-1980'";
        //opcion 2: PreparedStatement
        try (Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL2)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            System.out.println("\n sentencia 2:");
            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                System.out.println("Estudiantes: " + nombre + ", " + apellido);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //sentencia3

        String sentenciaSQL3 = "SELECT * FROM Estudiante ORDER BY fecha_nacimiento ASC";
        //opcion 2: PreparedStatement
        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL3)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            System.out.println("\n sentencia 3:");
            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                String fecha_nacimiento = resultados.getString("fecha_nacimiento");
                System.out.println("Estudiantes: " + nombre + ", " + apellido + ", " + fecha_nacimiento);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //sentencia4

        String sentenciaSQL4 = "SELECT COUNT(Estudiante.id_estudiante) AS cantidad, Casa.nombre FROM Estudiante JOIN Casa ON Estudiante.id_casa = Casa.id_casa GROUP BY Casa.nombre;";
        //opcion 2: PreparedStatement
        try (Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL4)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            System.out.println("\n sentencia 4:");
            while (resultados.next()) {
                String cantidad = resultados.getString("cantidad");
                String nombre_casa = resultados.getString("nombre");
                System.out.println("Estudiantes: " + cantidad + ", " + nombre_casa);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //sentencia5

        String sentenciaSQL5 = "SELECT AVG(calificacion) as media, Max(calificacion) as maxima FROM Estudiante_Asignatura JOIN Asignatura ON Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura  WHERE nombre = 'Pociones' ";
        //opcion 2: PreparedStatement
        try (Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL5)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            System.out.println("\n sentencia 5:");
            while (resultados.next()) {
                String media = resultados.getString("media");
                String maxima = resultados.getString("maxima");
                System.out.println("Media estudiantes: " + media + "\n Nota maxima " + maxima);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //sentencia6

        String sentenciaSQL6 = "SELECT DISTINCT anyo_curso FROM Estudiante ";
        //opcion 2: PreparedStatement
        try (Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL6)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            System.out.println("\n sentencia 6:");
            while (resultados.next()) {
                int anyoCurso = Integer.parseInt(resultados.getString("anyo_curso"));
                System.out.println("Año curso: " + anyoCurso);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //sentencia7

        String sentenciaSQL7 = "SELECT nombre, apellido FROM Estudiante where apellido like 'P%' ";
        //opcion 2: PreparedStatement
        try (Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL7)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            System.out.println("\n sentencia 7:");
            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                System.out.println("Estudiantes: " + nombre + ", " + apellido);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //sentencia8

        String sentenciaSQL8 = "SELECT nombre, apellido, anyo_curso FROM Estudiante where anyo_curso IN (4,5) ";
        //opcion 2: PreparedStatement
        try (Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL8)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            System.out.println("\n sentencia 8:");
            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                String anyo_curso = resultados.getString("anyo_curso");
                System.out.println("Estudiantes: " + nombre + ", " + apellido + ", " + anyo_curso);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //sentencia9

        String sentenciaSQL9 = "SELECT Estudiante.nombre, apellido FROM Estudiante join Casa on Estudiante.id_casa = Casa.id_casa where anyo_curso = 5 and (Casa.nombre = 'Gryffindor' or Casa.nombre = 'Slytherin' )";
        //opcion 2: PreparedStatement
        try (Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL9)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            System.out.println("\n sentencia 9:");
            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                System.out.println("Estudiantes: " + nombre + ", " + apellido);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //sentencia10

        String sentenciaSQL10 = "SELECT * FROM Estudiante ORDER BY fecha_nacimiento Limit 5";
        //opcion 2: PreparedStatement
        try (Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL10)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            System.out.println("\n sentencia 10:");
            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                String fecha_nacimiento = resultados.getString("fecha_nacimiento");
                System.out.println("Estudiantes: " + nombre + ", " + apellido + ", " + fecha_nacimiento);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //sentencia11

        String sentenciaSQL11 = "SELECT calificacion, Estudiante.nombre, Estudiante.apellido FROM Estudiante_Asignatura JOIN Asignatura ON Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura JOIN Estudiante ON Estudiante_Asignatura.id_estudiante = Estudiante.id_estudiante  WHERE Asignatura.nombre = 'vuelo' and calificacion >= 8 ";
        //opcion 2: PreparedStatement
        try (Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL11)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            System.out.println("\n sentencia 11:");
            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                double calificacion = resultados.getInt("calificacion");
                System.out.println("Estudiante: " + nombre + ", " + apellido + "\n calificacion: " + calificacion);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //sentencia12

        String sentenciaSQL12 = "INSERT INTO Estudiante (nombre, apellido, id_casa, anyo_curso, fecha_nacimiento) VALUES ('Nymphadora', 'Tonks', 4, 7, '1973-11-25')";
        //opcion 2: PreparedStatement
        try (Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL12)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            System.out.println("\n sentencia 12:");
            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                int anyo_curso = resultados.getInt("anyo_curso");
                String fecha_nacimiento = resultados.getString("fecha_nacimiento");
                System.out.println("Estudiante: " + nombre + ", " + apellido + ", " + anyo_curso + ", " + fecha_nacimiento);
            }
        } catch (SQLException e) {
            if ("23505".equals(e.getSQLState())) {
                System.out.println("El registro ya existe, no se ha insertado.");
            } else {
                e.printStackTrace();
            }
        }

        //sentencia13

        String sentenciaSQL13 = "UPDATE Casa SET id_jefe = (SELECT id_profesor FROM Profesor WHERE nombre = 'Pomona' AND apellido = 'Sprout' ) WHERE Casa.nombre = 'Hufflepuff' ";
        //opcion 2: PreparedStatement
        try (Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL13)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            int resultados = sentencia.executeUpdate();

            System.out.println("\n sentencia 13:");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //sentencia14

        String sentenciaSQL14 = "DELETE FROM Estudiante where nombre = 'Tom' and apellido = 'Riddle' ";
        //opcion 2: PreparedStatement
        try (Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL14)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            System.out.println("\n sentencia 14:");
            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                System.out.println("Estudiante: " + nombre + ", " + apellido);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        //sentencia15

        String sentenciaSQL15 = "SELECT Estudiante.nombre, Estudiante.apellido, Casa.nombre AS nombre_casa FROM Estudiante JOIN Casa ON Estudiante.id_casa = Casa.id_casa";
        //opcion 2: PreparedStatement
        try (Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL15)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            System.out.println("\n sentencia 15:");
            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                String Casa_nombre = resultados.getString("nombre_casa");
                System.out.println("Estudiante: " + nombre + ", " + apellido + ", " + Casa_nombre);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //sentencia16

        String sentenciaSQL16 = "SELECT Estudiante.nombre, Estudiante.apellido, Mascota.nombre AS nombre_mascota, Asignatura.nombre AS nombre_asignatura FROM Estudiante LEFT JOIN Mascota ON Estudiante.id_estudiante = Mascota.id_estudiante INNER JOIN Estudiante_asignatura ON Estudiante.id_estudiante = Estudiante_asignatura.id_estudiante INNER JOIN Asignatura ON Estudiante_asignatura.id_asignatura = Asignatura.id_asignatura";
        //opcion 2: PreparedStatement
        try (Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL16)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            System.out.println("\n sentencia 16:");
            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                String nombre_mascota = resultados.getString("nombre_mascota");
                String nombre_asignatura = resultados.getString("nombre_asignatura");
                System.out.println("Estudiante: " + nombre + ", " + apellido + ", " + nombre_mascota + ", " + nombre_asignatura);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //sentencia17

        String sentenciaSQL17 = "SELECT Estudiante.nombre, Estudiante.apellido, calificacion FROM Estudiante JOIN Estudiante_Asignatura ON Estudiante.id_estudiante = Estudiante_Asignatura.id_estudiante JOIN Asignatura ON Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura  WHERE Asignatura.nombre = 'Encantamientos' and calificacion > (SELECT avg(calificacion) FROM Estudiante_Asignatura )";
        //opcion 2: PreparedStatement
        try (Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL17)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            System.out.println("\n sentencia 17:");
            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                double calificacion = resultados.getInt("calificacion");
                System.out.println("Estudiante: " + nombre + ", " + apellido + "\n calificacion: " + calificacion);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //sentencia18

        String sentenciaSQL18 = "SELECT Casa.nombre, AVG(Estudiante_Asignatura.calificacion) AS media FROM Casa JOIN Estudiante ON casa.id_casa = Estudiante.id_casa JOIN Estudiante_Asignatura ON Estudiante.id_estudiante = Estudiante_Asignatura.id_estudiante GROUP BY Casa.nombre HAVING avg(Estudiante_Asignatura.calificacion) > 7";
        //opcion 2: PreparedStatement
        try (Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL18)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            System.out.println("\n sentencia 18:");
            while (resultados.next()) {
                String casa = resultados.getString("nombre");
                double calificacion = resultados.getInt("media");
                System.out.println("Estudiante: " + casa + "\n calificacion: " + calificacion);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
