package com.vti.backend;

import com.vti.entity.Department;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
 public class DepartmentDao {

	 private Connection connection;

	 public void databaseconnect() throws SQLException {
		 String dbUrl = "jdbc:mysql://localhost:3306/tsa_1";
		 String username = "root";
		 String password = "root";

		 connection = DriverManager.getConnection(dbUrl, username, password);
		 System.out.println("Kết nối thành công!");


	 }


	public List<Department> getDepartments() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {

		List<Department> departments = new ArrayList<Department>();

		Statement statement = connection.createStatement();

		String sql = "SELECT * FROM Department";
		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			Department department = new Department();
			department.setId(resultSet.getInt("DepartmentId"));
			department.setName(resultSet.getString("DepartmentName"));

			departments.add(department);
		}


		return departments;
	}


	public Department getDepartmentByID(int id) throws Exception {



		String sql = "SELECT * FROM Department WHERE DepartmentId = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setInt(1, id);

		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			Department department = new Department();
			department.setId(resultSet.getInt("DepartmentId"));
			department.setName(resultSet.getString("DepartmentName"));

			return department;

		} else {
			throw new Exception("Không tìm được: " + id);
		}
	}


	public boolean isDepartmentNameExists(String name) throws SQLException, IOException, ClassNotFoundException {

		// Create a statement object
		String sql = "SELECT 1 FROM Department WHERE DepartmentName = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		// set parameter
		preparedStatement.setString(1, name);

		// Step 4: execute query
		ResultSet resultSet = preparedStatement.executeQuery();

		// Step 5: handling result set
		if (resultSet.next()) {
			return true;

		} else {
			return false;
		}
	}


	public void createDepartment(String name) throws Exception {

		if (isDepartmentNameExists(name)) {
			throw new Exception("Đã có: "+ name);
		}


		String sql = "	INSERT INTO Department (DepartmentName)" + "	VALUE				(   ?	)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setString(1, name);

		preparedStatement.executeUpdate();

	}


	public boolean isDepartmentIdExists(int id) throws SQLException, IOException, ClassNotFoundException {


		String sql = "SELECT 1 FROM Department WHERE DepartmentID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setInt(1, id);

		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			return true;

		} else {
			return false;
		}
	}


	public void updateDepartment(int id, String newName) throws SQLException, Exception {

		// check department id exist
		if (!isDepartmentIdExists(id)) {
			throw new Exception("Không tìm thấy: "+ id);
		}

		// if department name not exist update



		// Create a statement object
		String sql = "	UPDATE Department SET DepartmentName = ? WHERE DepartmentId = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);


		preparedStatement.setString(1, newName);
		preparedStatement.setInt(2, id);

		preparedStatement.executeUpdate();

	}

	public void deleteDepartment(int id) throws Exception {

		if (!isDepartmentIdExists(id)) {
			throw new Exception("Không tìm thấy: "+ id);
		}



		String sql = "DELETE FROM Department WHERE DepartmentID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setInt(1, id);

		preparedStatement.executeUpdate();

	}

	 public void closeConnection() throws SQLException {
		 connection.close();
	 }

}
