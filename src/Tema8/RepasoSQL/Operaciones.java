package Tema8.RepasoSQL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Operaciones {
    public List<Asignatura> listarAsignaturas() {
        List<Asignatura> lista = new ArrayList<>();
        String sql = "SELECT id, nombre, aula FROM Asignatura";

        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ceuozunrvsdu.us-east-1.rds.amazonaws.com:5432/hogwarts", "postgres", String.valueOf(12345678));
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                // Instanciamos el objeto con los datos de la fila actual
                Asignatura asignatura = new Asignatura(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getInt("aula")
                );
                lista.add(asignatura);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar asignaturas: " + e.getMessage());
        }
        return lista;
    }
}
