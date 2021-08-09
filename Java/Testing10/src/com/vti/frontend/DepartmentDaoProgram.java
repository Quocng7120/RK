package com.vti.frontend;

import com.vti.backend.DepartmentDao;
import com.vti.entity.Department;
import com.vti.ultis.ScannerUtils;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class DepartmentDaoProgram {
	private static DepartmentDao departmentDao;

	public static void main(String[] args) throws Exception {

		departmentDao = new DepartmentDao();

		departmentDao.databaseconnect();
		q1();
		q2_3();
		q4();
		q5();
		q6();
		q7();

		departmentDao.closeConnection();
	}

	private static void q1() throws SQLException, IOException, ClassNotFoundException {
		List<Department> departments = departmentDao.getDepartments();

		for (Department department : departments) {
			System.out.println(department);
		}
	}

	public static void q2_3() throws Exception {
		System.out.println("Input department id: ");
		int id = ScannerUtils.inputId();

		Department department = departmentDao.getDepartmentByID(id);
		System.out.println(department);
	}

	public static void q4() throws Exception {
		System.out.println("Input department Name: ");
		String name = ScannerUtils.inputName();

		boolean result = departmentDao.isDepartmentNameExists(name);
		System.out.println("Result: " + result);
	}

	public static void q5() throws Exception {
		System.out.println("Input department Name: ");
		String name = ScannerUtils.inputName();

		departmentDao.createDepartment(name);
		System.out.println("create success!");
	}

	public static void q6() throws Exception {
		System.out.println("Input department id: ");
		int id = ScannerUtils.inputId();

		System.out.println("Input department new name: ");
		String newName = ScannerUtils.inputName();

		departmentDao.updateDepartment(id, newName);
		System.out.println("update success!");
	}

	public static void q7() throws Exception {
		System.out.println("Input department id: ");
		int id = ScannerUtils.inputId();

		departmentDao.deleteDepartment(id);
		System.out.println("delete success!");
	}
}
