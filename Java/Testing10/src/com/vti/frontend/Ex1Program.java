package com.vti.frontend;

import com.vti.backend.Ex1;

import java.io.IOException;
import java.sql.SQLException;

public class Ex1Program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

		Ex1 program = new Ex1();

		// Question 1:
		program.databaseconnect();

		// Question 2:
		program.q2();

		// Question 3:
		program.q3("PS1");

		// Question 4:
		program.q4();

		// Question 5:
		program.q5(3);

		// Close connection
		program.closeConnection();
	}

}
