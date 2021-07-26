import KhoiTao.Department;

public class MainClass {
    public static void main(String[] args) {

        Department department1 = new Department();
        Department department2 = new Department("ABC");

        System.out.println(department2.getDepartmentName());
    }
}
