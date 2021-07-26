package KhoiTao;

public class Department {
    private int departmentID;
    private String departmentName;

    public Department() {
    }

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.departmentID = 0;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
