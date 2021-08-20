package vti.backend;

import vti.utils.JdbcUtils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Testlist {
    private JdbcUtils jdbcUtils;
    private Connection connection;

    public Testlist() throws SQLException, IOException, ClassNotFoundException {
        jdbcUtils = new JdbcUtils();
    }

    public void Printlist() throws SQLException, ClassNotFoundException {
        connection = jdbcUtils.connect();

        // Step 3: Create a statment object
        Statement statement = connection.createStatement();

        // Step 4: Execute query
        String listUser = "SELECT * FROM user Where id =7";
        ResultSet resultSet = statement.executeQuery(listUser);

        // Step 5: Handling result set
        while (resultSet.next()) {
            int userId = resultSet.getInt(1);
            String fullName = resultSet.getString(2);
            String email = resultSet.getString(3);
            String password = resultSet.getString(4);
            System.out.println(userId);
            System.out.println(fullName);
            System.out.println(email);
            System.out.println(password);

        }
    }
}
