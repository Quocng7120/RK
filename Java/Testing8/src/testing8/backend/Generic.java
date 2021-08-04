package testing8.backend;

import testing8.entity.Ex3.Phone;
import testing8.entity.Ex3.Staff;
import testing8.entity.Ex3.Student;
import testing8.entity.Ex3.StudentMap;

public class Generic {
    public void Q1_2() {
        // khởi tạo student có id là int
        Student<Integer> student1 = new Student<Integer>(1, "Dang Black");

        // khởi tạo student có id là float
        Student<Float> student2 = new Student<Float>(2.0f, "Hai Dang Black");

        // khởi tạo student có id là double
        Student<Double> student3 = new Student<Double>(3.0, "Duy Nguyen VTI");

        // Question 2: T generic method print object
        print(student1);
        print(student2);
        print(student3);

        // print number
        print(1);
        print(2f);
        print(3d);
    }

    public void Q4() {
        // init array
        Integer[] arrInt = { 2, 13, 45 };
        Float[] arrFloat = { 5.3f, 7.3f, 90.1f };
        Double[] arrDouble = { 6.3, 6.9, 7.2 };

        // print array
        printArray(arrInt);
        printArray(arrFloat);
        printArray(arrDouble);
    }

    public void Q6(){
        StudentMap studentMap = new StudentMap(1, "Nguyễn Duy Quốc");
        StudentMap studentMap1 = new StudentMap("id2", "Nguyễn Duy Quốc");
        System.out.println(studentMap.toString());
        System.out.println(studentMap1.toString());


    }

    public void Q7() {
        // <email, phone number>
        Phone<String, String> email = new Phone<String, String>("quocng@gmail.com", "0342082940");
        System.out.println("Email: " + email.getKey() + " / " + "Phone Number: " + email.getPhoneNumber());

        // <id, phone number>
        Phone<Integer, String> id = new Phone<Integer, String>(1, "012558654");
        System.out.println("id: " + id.getKey() + " / " + "Phone Number: " + id.getPhoneNumber());

        // <name, phone number>
        Phone<String, String> name = new Phone<String, String>("Quốc", "0334879658");
        System.out.println("Name: " + name.getKey() + " / " + "Phone Number: " + name.getPhoneNumber());
    }

    public void Q8() {
        // Integer
        Staff<Integer> staff1 = new Staff<Integer>(1, "Nguyễn Văn A");
        System.out.println("ID: " + staff1.getId() + " / " + "Name: " + staff1.getName());

        // Float
        Staff<Float> staff2 = new Staff<Float>(1.5f, "Nguyễn Văn B");
        System.out.println("ID: " + staff2.getId() + " / " + "Name: " + staff2.getName());
    }

    private <T> void print(T a) {
        System.out.println(a.toString());
    }

    private <T> void printArray(T[] arr) {
        for (T x : arr) {
            System.out.println(x.toString());
        }
    }
}
