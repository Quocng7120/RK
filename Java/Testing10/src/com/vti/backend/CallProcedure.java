package com.vti.backend;




import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CallProcedure {


	private DepartmentDao departmentDao;
	private Connection connection;

	public void databaseconnect() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/tsa_1";
		String username = "root";
		String password = "root";

		connection = DriverManager.getConnection(dbUrl, username, password);
		System.out.println("Kết nối thành công!");


	}

	public CallProcedure() {

		departmentDao = new DepartmentDao();
	}

	// Call Procedure
	public void deleteDepartmentUsingProcedure(int id) throws Exception {
		// check department id exist
		if (!departmentDao.isDepartmentIdExists(id)) {
			throw new Exception("Không tìm thấy: "+ id);
		}

		String sql = "{CALL sp_delete_department(?)}";
		CallableStatement callabeStatement = connection.prepareCall(sql);

		callabeStatement.setInt(1, id);

		callabeStatement.executeUpdate();

		connection.close();
	}
}
