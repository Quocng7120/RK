package Ex5.Person;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String name;
    private String gender;
    private LocalDate birthday;
    private String address;

    public Person() {
    }

    public Person(String name, String gender, LocalDate birthday, String address) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên:");
        name = scanner.nextLine();

        System.out.println("Nhập giới tính: ");
        gender = scanner.nextLine();

        System.out.println("Nhập ngày sinh: ");
        birthday = LocalDate.parse(scanner.nextLine());

        System.out.println("Nhập địa chỉ: ");
        address = scanner.nextLine();
    }

    public void showInfo() {
        System.out.println("Tên: " + name + "\nGiới tính: " + gender + "\nNgày sinh: " + birthday + "\nĐịa chỉ: " + address);
    }
}
