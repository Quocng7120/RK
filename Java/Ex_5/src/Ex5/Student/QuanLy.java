package Ex5.Student;

public class QuanLy {
    private Student[] students;

    public QuanLy() {
        students = new Student[11];
    }

    public void Tao() {
        students[1] = new Student(1, "Nam", 1);
        students[2] = new Student(2, "Quân", 1);
        students[3] = new Student(3, "Quốc", 1);
        students[4] = new Student(4, "Dũng", 2);
        students[5] = new Student(5, "Chiến", 2);
        students[6] = new Student(6, "Huyền", 2);
        students[7] = new Student(7, "Phương", 3);
        students[8] = new Student(8, "Doanh", 3);
        students[9] = new Student(9, "Quỳnh", 3);
        students[10] = new Student(10, "Giang", 3);
    }

    public void lopDiemDanh() {
        for (int i = 1; i <= 10; i++) {
            students[i].diemDanh();
        }
    }

    public void hocBai() {
        for (int i = 1; i <= 10; i++) {
            if (students[i].getGroup() == 1) {
                students[i].hocBai();
            }
        }
    }

    public void donVeSinh() {
        for (int i = 1; i <= 10; i++) {
            if (students[i].getGroup() == 2) {
                students[i].diDonVeSinh();
            }
        }
    }
}
