package Test7.backend;

import Test7.entity.student.PrimaryStudent;
import Test7.entity.student.SecondaryStudent;
import Test7.entity.student.Student;

public class Static {
    Student[] students;

    public void Q1()
    {
        students = new Student[3];
        students[0] = new Student("Nguyễn Văn A");
        students[1] = new Student("Nguyễn Văn B");
        students[2] = new Student("Nguyễn Văn C");

        for (Student student : students)
        {
            System.out.println(student.toString());
        }

        Student.setCollege("Đại Học Công Nghiệp");
        for (Student student : students)
        {
            System.out.println(student.toString());
        }
    }

    public void Q2()
    {
        System.out.println("Số tiền trước khi tiêu là: " + Student.getMoneyGroup());

        students[0].tieuTien(50, "mua kẹo");
        System.out.println("Tiền còn: " + Student.getMoneyGroup() + "k");
        students[1].tieuTien(20, "mua bánh mì");
        System.out.println("Tiền còn: " + Student.getMoneyGroup() + "k");
        students[2].tieuTien(150, "mua dụng cụ học tập");
        System.out.println("Tiền còn: " + Student.getMoneyGroup() + "k");

        for (Student student : students)
        {
            student.nopTien(50);
            System.out.println("Tiền còn: " + Student.getMoneyGroup() + "k");
        }
    }

    public void Q6()
    {
        Student student1 = new PrimaryStudent("Nguyễn Văn A");
        Student student2 = new PrimaryStudent("Nguyễn Văn B");
        Student student3 = new SecondaryStudent("Nguyễn Văn C");
        Student student4 = new SecondaryStudent("Nguyễn Văn D");
        Student student5 = new SecondaryStudent("Nguyễn Văn E");
        Student student6 = new SecondaryStudent("Nguyễn Văn F");

        System.out.println("Tổng Student" + Student.getCount());
        System.out.println("Tổng Primary Student: " + PrimaryStudent.getPrimaryCount());
        System.out.println("Tổng Secondary Student: " + SecondaryStudent.getSecondaryCount());
    }

    public void Q7()
    {
        Student student1 = new PrimaryStudent("Nguyễn Văn A");
        Student student2 = new PrimaryStudent("Nguyễn Văn B");
        Student student3 = new SecondaryStudent("Nguyễn Văn C");
        Student student4 = new SecondaryStudent("Nguyễn Văn D");
        Student student5 = new SecondaryStudent("Nguyễn Văn E");
        Student student6 = new SecondaryStudent("Nguyễn Văn F");
        Student student7 = new SecondaryStudent("Nguyễn Văn G");
        Student student8 = new SecondaryStudent("Nguyễn Văn H");
        Student student9 = new SecondaryStudent("Nguyễn Văn I");

        System.out.println(student9.toString());
    }
}
