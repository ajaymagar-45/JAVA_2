package JDBC;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName(JDBCConstant.DRIVER_NAME);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("PostgreSQL Driver not found", e);
        }

        return DriverManager.getConnection(
                JDBCConstant.URL,
                JDBCConstant.USERNAME,
                JDBCConstant.PASSWORD
        );
    }
}

