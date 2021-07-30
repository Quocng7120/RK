package Test7.entity.student;

public class Student {
    private int id;
    private String name;
    private static String college;
    private static int moneyGroup = 0;
    private static int count = 0;
    private static final int maxStudent = 7;



    public Student(String name) {

        if (count > maxStudent)
        {
            System.out.println("Đã lớn hơn 7 học sinh");
        }
        else
        {
            this.id = count++;
            this.name = name;
            college = "Đại học bách khoa";
            moneyGroup += 100;
        }


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

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    public static int getMoneyGroup() {
        return moneyGroup;
    }

    public static int getCount() {
        return count;
    }

    public static void setMoneyGroup(int moneyGroup) {
        Student.moneyGroup = moneyGroup;
    }

    public void tieuTien(int tien, String mucDich)
    {
        moneyGroup -= tien;
        System.out.println("Tiêu " + tien +"k để " + mucDich);
    }

    public void nopTien(int tien)
    {
        moneyGroup += tien;
    }



    @Override
    public String toString() {
        return "ID: " + id + ", Tên: " + name + ", Trường: " + college + "\n";
    }
}
