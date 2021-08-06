package Test9.backend;


import Test9.entity.Student;

import java.util.Date;

public class Annotations {

	@SuppressWarnings("deprecation")
	public void Q1() {
		Date date = new Date(2020 , 05 , 18);
		System.out.println(date.toString());
	}

	public void Q2() {
		Student student = new Student(1, "Nguyễn Văn A");
		System.out.println(student.getId());
		System.out.println(student.getName());

		System.out.println(student.getIdVer2());

	}
}
