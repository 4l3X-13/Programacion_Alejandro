package Tema8.RepasoSQL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Operaciones {

    public List<Asignatura> obtenerAsignaturas() {

        List<Asignatura> listaAsignaturas = new ArrayList<>();

        String sql = "SELECT * FROM Asignatura";

        try (Connection con = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Asignatura asignatura = new Asignatura();
                asignatura.setIdAsignatura(rs.getInt("id_asignatura"));
                asignatura.setNombre(rs.getString("nombre"));
                asignatura.setAula(rs.getString("aula"));

                listaAsignaturas.add(asignatura);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return listaAsignaturas;
    }

    public String estudiantesPorCasa(String casa) {

        String sentencia2 = "SELECT Estudiante.nombre, Estudiante.apellido, Casa.nombre AS nombre_casa FROM Estudiante JOIN Casa ON Estudiante.id_casa = Casa.id_casa WHERE Casa.nombre = '" + casa + "'";

        try (Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentencia2)) {

            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                String nombre_casa = resultados.getString("nombre_casa");
                System.out.println("Estudiantes: " + nombre + ", " + apellido + ", " + nombre_casa);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return sentencia2;
    }

    public void mascotaDeUnEstudianteEspecifico(String persona) {

        String sentencia3 = "SELECT Estudiante.nombre, Estudiante.apellido, Mascota.nombre AS nombre_mascota FROM Estudiante LEFT JOIN Mascota ON Estudiante.id_estudiante = Mascota.id_estudiante WHERE Estudiante.nombre = '" + persona + "'";

        try (Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentencia3)) {

            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                String nombre_mascota = resultados.getString("nombre_mascota");
                System.out.println("Estudiantes: " + nombre + ", " + apellido + ", " + nombre_mascota);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void NumeroEstudiantesPorCasa() {

        String sentencia3 = "SELECT COUNT(Estudiante.id_estudiante) AS cantidad, Casa.nombre FROM Estudiante JOIN Casa ON Estudiante.id_casa = Casa.id_casa GROUP BY Casa.nombre;";

        try (Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentencia3)) {

            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String cantidad = resultados.getString("cantidad");
                String nombre_casa = resultados.getString("nombre");
                System.out.println("Estudiantes: " + cantidad + ", " + nombre_casa);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insertarAsignatura(int id, String nombre2, String aula2, boolean esOblidatoria) {
        String sentencia4 = "INSERT INTO Asignatura (id_asignatura, nombre, aula, obligatoria) VALUES ('" + id + "', '" + nombre2 + "', '" + aula2 + "', '" + esOblidatoria + "')";
        //opcion 2: PreparedStatement
        try (Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentencia4)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            int resultados = sentencia.executeUpdate();


            if (resultados > 0) {
                System.out.println("Asignatura insertado exitosamente");
            } else {
                System.out.println("Asignatura insertado no exitosamente");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void modificarAsignatura(int id, String aula2) {
        String sentencia5 = "UPDATE Asignatura SET aula = '" + aula2 + "' WHERE id_asignatura = '" + id + "' ";
        //opcion 2: PreparedStatement
        try (Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con2.prepareStatement(sentencia5)) {

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            int resultados = sentencia.executeUpdate();

            if (resultados > 0) {
                System.out.println("Asignatura actualizada exitosamente");
            } else {
                System.out.println("Asignatura actualizada no exitosamente");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void eliminarAsignatura(int id) {
        String sentenciaSQL = "DELETE FROM Asignatura where id_asignatura = '" + id + "'";
        try (Connection con = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement sentenciaSQL1 = con.prepareStatement(sentenciaSQL)) {
            int resultados = sentenciaSQL1.executeUpdate();
            if (resultados > 0) {
                System.out.println("Asignatura borrada con éxito");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}