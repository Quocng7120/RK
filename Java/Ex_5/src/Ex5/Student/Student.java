package Ex5.Student;

public class Student implements IStudent {
    private int id;
    private String name;
    private int group;

    public Student(int id, String name, int group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public void diemDanh() {
        System.out.println(name + "Điểm danh");
    }

    @Override
    public void hocBai() {
        System.out.println(name + "Đang học bài");

    }

    @Override
    public void diDonVeSinh() {
        System.out.println(name + "đang dọn vệ sinh");
    }
}
