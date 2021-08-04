package testing8.backend;

import testing8.entity.Ex1_2.Student;

import java.util.ArrayList;
import java.util.Collections;

public class Comparing {
    ArrayList<Student> studentArrayList;

    public void addStudent(){
        studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("Nguyễn Văn A"));
        studentArrayList.add(new Student("Nguyễn Văn B"));
        studentArrayList.add(new Student("Nguyễn Văn B"));
        studentArrayList.add(new Student("Nguyễn Văn C"));
        studentArrayList.add(new Student("Nguyễn Văn D"));
        studentArrayList.add(new Student("Nguyễn Văn E"));
        studentArrayList.add(new Student("Nguyễn Văn B"));
    }

    public void Q1(){
//        studentArrayList.sort(Student::compareTo);
        Collections.sort(studentArrayList);
    }
}
