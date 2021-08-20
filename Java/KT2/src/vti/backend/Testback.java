package vti.backend;

import java.sql.*;

public class Testback {

    private Connection connection;

    public void databaseconnect() throws SQLException {
        String dbUrl = "jdbc:mysql://localhost:3306/usermanager";
        String username = "root";
        String password = "root";

        connection = DriverManager.getConnection(dbUrl, username, password);
        System.out.println("Kết nối thành công!");


    }

    public void q2() throws SQLException {
        Statement statement = connection.createStatement();

        String sql = "SELECT * FROM user";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1));
            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getString(3));
        }
    }
}
