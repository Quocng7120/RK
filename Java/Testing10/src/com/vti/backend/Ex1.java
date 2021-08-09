package com.vti.backend;
import java.sql.*;

public class Ex1 {

    private Connection connection;

    public void databaseconnect() throws SQLException {
        String dbUrl = "jdbc:mysql://localhost:3306/tsa_1";
        String username = "root";
        String password = "root";

        connection = DriverManager.getConnection(dbUrl, username, password);
        System.out.println("Kết nối thành công!");


    }

    public void q2() throws SQLException {
        Statement statement = connection.createStatement();

        String sql = "SELECT PositionID, PositionName FROM Position";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("PositionID"));
            System.out.println(resultSet.getString("PositionName"));
        }
    }

    public void q3(String name) throws SQLException {


        String sql = "	INSERT INTO `Position` (	PositionName	) "
                + "	VALUE 					(		?			)";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, name);

        int effectedRecordAmount = statement.executeUpdate();

        if (effectedRecordAmount == 1) {
            System.out.println("Tạo thành công");
        } else {
            System.out.println("Tạo không thành công");
        }
    }

    public void q4() throws SQLException {

        Statement statement = connection.createStatement();

        String sql = "UPDATE `Position` SET PositionName = 'Dev' WHERE PositionID = 5";
        int effectedRecordAmount = statement.executeUpdate(sql);

        if (effectedRecordAmount == 1) {
            System.out.println("Sửa thành công");
        } else {
            System.out.println("Sửa không thành công");
        }
    }

    public void q5(int id) throws SQLException {

        String sql = " DELETE FROM `Position` WHERE PositionID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1, id);

        int effectedRecordAmount = statement.executeUpdate();

        // Handing result set
        if (effectedRecordAmount == 1) {
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Xóa không thành công");
        }

    }

    public void closeConnection() throws SQLException {
        // Close connection
        connection.close();
    }
}
