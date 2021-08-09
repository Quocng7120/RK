package com.vti.frontend;

import com.vti.backend.CallProcedure;
import com.vti.ultis.ScannerUtils;


public class CallProcedureProgram {

	public static CallProcedure callProcedure;

	public static void main(String[] args) throws Exception {
		callProcedure = new CallProcedure();
		callProcedure.databaseconnect();
		q1();
	}

	public static void q1() throws Exception {
		System.out.println("Nhập Id: ");
		int id = ScannerUtils.inputId();

		callProcedure.deleteDepartmentUsingProcedure(id);
		System.out.println("Xóa thành công");
	}
}
