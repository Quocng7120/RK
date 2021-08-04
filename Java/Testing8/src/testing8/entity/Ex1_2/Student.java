package testing8.entity.Ex1_2;

public class Student implements Comparable<Student>{

    private int id;
    private String name;
    private static int counter = 0;

    public Student(String name) {
        this.id = ++counter;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Student.counter = counter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Student student) {
        if (name.compareTo(student.name) > 0) {
            return 1;
        }

        if (name.compareTo(student.name) < 0) {
            return -1;
        }

        return 0;
    }
}
