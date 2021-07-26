package Ex5.Person;

import java.time.LocalDate;
import java.util.Scanner;

public class Student extends Person{
    private int mSV;
    private float dTB;
    private String email;

    public Student(String name, String gender, LocalDate birthday, String address) {
        super(name, gender, birthday, address);
    }

    public Student(String name, String gender, LocalDate birthday, String address, String email) {
        super(name, gender, birthday, address);
        this.email = email;
    }

    @Override
    public void inputInfo()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập mã sinh viên: ");
        mSV = scanner.nextInt();

        super.inputInfo();

        System.out.println("Nhập điểm trung bình: ");
        dTB = scanner.nextFloat();

        System.out.println("Nhập email: ");
        email = scanner.nextLine();
    }

    @Override
    public void showInfo()
    {
        System.out.println("showInfo override");
    }

    public void hocBong()
    {
        if (dTB > 8)
            System.out.println("Đạt học bổng");
        else
            System.out.println("Không đạt");
    }
}
