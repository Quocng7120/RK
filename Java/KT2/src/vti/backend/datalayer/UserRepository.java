package vti.backend.datalayer;

import vti.entity.User;
import vti.utils.JdbcUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {
    private JdbcUtils jdbcUltils;
    private Connection connection;

    public UserRepository() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
        jdbcUltils = new JdbcUtils();
    }

    @Override
    public List<User> getListUsers() throws SQLException, ClassNotFoundException {
        List<User> users = new ArrayList<>();

        try {
            // get connect
            connection = jdbcUltils.connect();

            // Step 3: Create a statment object
            Statement statement = connection.createStatement();

            // Step 4: Execute query
            String listUser = "SELECT * FROM user";
            ResultSet resultSet = statement.executeQuery(listUser);

            // Step 5: Handling result set
            while (resultSet.next()) {
                int userId = resultSet.getInt("UserID");
                String fullName = resultSet.getString("FullName");
                String email = resultSet.getString("Email");
                String password = resultSet.getString("Password");

                User user = new User(userId, fullName, email, password);
                users.add(user);

            }
            return users;
        } finally {
            // Step 6: Close connection
            connection.close();
        }

    }

    @Override
    public User getUserById(int id) throws SQLException, ClassNotFoundException {
        try {
            // Step 2: get connect
            connection = jdbcUltils.connect();

            // Step 3: Create a statement object
            String sql = " SELECT * " + " FROM `User` " + " WHERE id = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // set parameter
            preparedStatement.setInt(1, id);

            // Step 4: Execute SQL query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Step 5: Handling result set
            while (resultSet.next()) {
                int userId = resultSet.getInt("id");
                String fullName = resultSet.getString("fullname");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");

                User user = new User(userId, fullName, email, password);

                return user;
            }
            return null;

        } finally {
            connection.close();
        }
    }

    @Override
    public int deleteUser(int id) throws ClassNotFoundException, SQLException {
        try {

            // Step 2: get connect
            connection = jdbcUltils.connect();

            // Step 3: Create a statement object
            String sql = " DELETE " + " FROM `User` " + " WHERE UserID = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // set parameter
            preparedStatement.setInt(1, id);

            // Step 4: Execute Query

            int effectedRecodAmount = preparedStatement.executeUpdate();

            // Step 5: Handling result
            return effectedRecodAmount;

        } finally {
            connection.close();
        }
    }

    @Override
    public boolean isUserIdExits(int id) throws SQLException, ClassNotFoundException {
        try {

            // step 2: get connect
            connection = jdbcUltils.connect();

            // Step 3: Create a statement object

            String sql = "SELECT * FROM user " + " WHERE UserID = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // set parameter
            preparedStatement.setInt(1, id);

            // Step 4: Execute Query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Step 5: Handling result set

            if (resultSet.next()) {

                return true;
            }

            return false;
        } finally {
            connection.close();
        }

    }

    @Override
    public User login(String email, String password) throws Exception {

        try {

            // step 2: get connect
            connection = jdbcUltils.connect();

            // Step 3: Create a statement object

            String sql = "SELECT * FROM user " + "WHERE Email = ? AND Password = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // set parameter
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            // Step 4: Execute Query

            ResultSet resultSet = preparedStatement.executeQuery();

            // Step 5: Handling result
            if (resultSet.next()) {
                int userId = resultSet.getInt("id");
                String fullName = resultSet.getString("fullName");

                User user = new User(userId, fullName, email, password);
                return user;
            } else {
                throw new Exception("Tai khoan hoac mat khau sai!");
            }

        } finally {
            connection.close();
        }

    }
}