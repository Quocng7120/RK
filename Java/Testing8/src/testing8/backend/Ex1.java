package testing8.backend;

import testing8.entity.Ex1_2.Student;

import java.util.*;

public class Ex1 {
    ArrayList<Student> studentArrayList;
    public void Q1(){
        studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("Nguyễn Văn A"));
        studentArrayList.add(new Student("Nguyễn Văn B"));
        studentArrayList.add(new Student("Nguyễn Văn B"));
        studentArrayList.add(new Student("Nguyễn Văn C"));
        studentArrayList.add(new Student("Nguyễn Văn D"));
        studentArrayList.add(new Student("Nguyễn Văn E"));
        studentArrayList.add(new Student("Nguyễn Văn B"));

//        System.out.println(studentArrayList);

        //a)in tổng số phần tử
        System.out.println("Tỏng số phần tử của ArrayList là : " + studentArrayList.size() + "\n");

        //b)in phần tử thứ 4
        System.out.println("Phần tử thứ 4 của dãy là: " + studentArrayList.get(4).toString() + "\n");

        //c)in phần tử đầu và cuối
        System.out.println("Phần tử đầu của dãy là: " + studentArrayList.get(0).toString());
        System.out.println("Phần tử cuối của dãy là: " + studentArrayList.get(studentArrayList.size()-1).toString() + "\n");

        //d,e) thêm 1 phần tử vào đầu và cuối
        studentArrayList.add(new Student("Phần tử cuối"));
        studentArrayList.add(0, new Student("Phần tử đầu"));
        System.out.println("Phần tử đầu của dãy là: " + studentArrayList.get(0).toString());

        //f) đảo ngược vị trí các student
        Collections.reverse(studentArrayList);




    }

    //g) tìm student theo ID
    public void findStudentById(int id) {

        for (Student student : studentArrayList) {
            if (student.getId() == id) {
                System.out.println(student);
            }
        }
    }

    // h) tìm student theo tên
    public void findStudentByName(String name) {

        for (Student student : studentArrayList) {
            if (student.getName().equals(name)) {
                System.out.println(student);
            }
        }
    }

    // j) xóa name student có id = 2;
    public void deleteNameStudentId2() {
        for (Student student : studentArrayList) {
            if (student.getId() == 2) {
                student.setName(null);
                break;
            }
        }

        System.out.println("Danh sách student sau khi xóa name id 2: ");
        System.out.println(studentArrayList);
    }

    // k) xóa student có id = 5;
    public void deleteStudentId5() {
        for (Student student : studentArrayList) {
            if (student.getId() == 5) {
                studentArrayList.remove(student);
                break;
            }
        }
    }

    public void addAllStudentsToStudentCopies() {
        ArrayList<Student> studentArrayList2 = new ArrayList<>();
        studentArrayList2.addAll(studentArrayList);
    }

    public <T> void print(T a) {
        System.out.println(a.toString());
    }

    public void Q2_a(){
        Stack<Student> studentStack = new Stack<>();
        studentStack.push(new Student("Nguyễn Văn Nam"));
        studentStack.push(new Student("Nguyễn Văn Huyên"));
        studentStack.push(new Student("Trần Văn Nam"));
        studentStack.push(new Student("Nguyễn Văn A"));

        System.out.println(studentStack.pop());
        System.out.println(studentStack.pop());
        System.out.println(studentStack.pop());
        System.out.println(studentStack.pop());

    }

    public void Q2_b(){
        Queue<Student> studentQueue = new LinkedList<>();
        studentQueue.add(new Student("Nguyễn Văn Nam"));
        studentQueue.add(new Student("Nguyễn Văn Huyên"));
        studentQueue.add(new Student("Trần Văn Nam"));
        studentQueue.add(new Student("Nguyễn Văn A"));

        System.out.println(studentQueue.poll());
        System.out.println(studentQueue.poll());
        System.out.println(studentQueue.poll());
        System.out.println(studentQueue.poll());
    }

    public void MapStudent(){
        Map<Integer, String> studentMap = new HashMap<>();

        studentMap.put(1, "Nguyễn Văn A");
        studentMap.put(2, "Nguyễn Văn B");
        studentMap.put(3, "Nguyễn Văn C");

        studentMap.forEach((key, value) -> System.out.println(key + "-" + value));
    }




}
