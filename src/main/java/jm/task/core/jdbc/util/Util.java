package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {


    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_hibernate";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "96321456Zxx";
//    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static Connection connection;


    public static Connection getConnection() {
        try {

            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connected to database");
        } catch (SQLException e ) {
            throw new RuntimeException(e);
        }
        return connection;
    }
    public static void closeResources() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
