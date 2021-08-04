package testing8.frontend;

import testing8.backend.Ex1;
import testing8.entity.Ex1_2.Student;

public class Program1 {


    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
//        ex1.Q1();
        Student student = new Student("Nguyễn Duy Quốc");

//        ex1.print(student);
//        ex1.print(3);
//        ex1.print(12.5f);
//        ex1.print("student");
//        ex1.print(new Student("Nguyễn Văn A"));
        ex1.MapStudent();
    }
}
