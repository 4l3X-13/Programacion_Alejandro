package Tema8.Actividades_AADD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // ─── Ajusta estos valores a tu entorno (local o AWS RDS) ──────────────────
    private static final String URL = "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/f12006";
    private static final String USER = "postgres";
    private static final String PASSWORD = "12345678";

    private static DatabaseConnection instance;
    private Connection connection;

    // Constructor PRIVADO: nadie puede hacer 'new DatabaseConnection()' desde fuera
    private DatabaseConnection() throws SQLException {
        this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
    }


    public static synchronized DatabaseConnection getInstance() throws SQLException {
        if (instance == null || instance.getConnection().isClosed()) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}