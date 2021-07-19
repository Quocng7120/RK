import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {

        Department department1 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "Sale";

        Department department2 = new Department();
        department2.departmentId = 2;
        department2.departmentName = "Marketting";

        // create group
        Group group1 = new Group();
        group1.groupID = 1;
        group1.groupName = "Java Fresher";

        Group group2 = new Group();
        group2.groupID = 2;
        group2.groupName = "C# Fresher";


        // Create position
        Position position1 = new Position();
        position1.positionID = 1;
        position1.PositionName = "Sale";

        Position position2 = new Position();
        position1.positionID = 2;
        position1.PositionName = "Marketing";

        Account account1 = new Account();
        account1.accountID = 1;
        account1.email = "haidnag@gmail.com";
        account1.groups = new Group[]{group1, group2};
        account1.position = position1;
        account1.department = department1;
        account1.fullName = "Nguyễn Hải Đăng";
        account1.CreateDate = LocalDate.now();
        account1.username = "haidangproductions";


        Account account2 = new Account();
        account2.accountID = 2;
        account2.email = "nguyenhaidang@gmail.com";
        account2.groups = new Group[]{group1};
        account2.position = position2;
        account2.department = department2;
        account2.fullName = "Nguyễn Hải Đăng";
        account2.CreateDate = LocalDate.now();
        account2.username = "dangblack";
        group1.accounts = new Account[]{account1, account2};

        Account account3 = new Account();
        account2.accountID = 3;
        account2.email = "Hoangvandang@gmail.com";
        account2.groups = new Group[]{group2};
        account2.position = position1;
        account2.department = department2;
        account2.fullName = "Hoàng Văn Đăng";
        account2.CreateDate = LocalDate.now();
        account2.username = "dangblue";
        group2.accounts = new Account[]{account1, account3};

//        array accouts
//
//        Account[] accounts = new Account[] {account1, account2, account3};

        //Câu 1
        if (account2.department == null) {
            System.out.println("Nhân viên này không có phòng ban");
        } else
            System.out.println("Phòng ban của nhân viên này là: " + account2.department.departmentName);

        //Câu 2
        if (account2.groups == null) {
            System.out.println("Nhân viên này chưa vào Group nào cả");
        } else if (account2.groups.length == 2)
            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
        else if (account2.groups.length == 3)
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        else if (account2.groups.length >= 4)
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");

        //Câu 3

        System.out.println(account2.department == null ? "Nhân viên này chưa có phòng ban" : "Nhân viên này thuộc phòng ban: " + account2.department.departmentName);

        //Câu 4
        System.out.println(account1.position.PositionName == "Dev" ? "Nhân viên này là DEV" : "Nhân viên này không phải DEV");

        //Câu 5
        int sonhanvien = group1.accounts.length;
        switch (sonhanvien) {
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có 2 thành viên");
                break;
            case 3:
                System.out.println("Nhóm có 3 thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
        }

        //Câu 6

        int sonhom = account1.groups.length;
        switch (sonhom) {
            case 0:
                System.out.println("Nhân viên này chưa có group");
                break;
            case 1:
                System.out.println("2");
                break;
            case 2:
                System.out.println("3");
                break;
            default:
                System.out.println("nhiều");
        }

        //Câu 7
        String Position = new String(account1.position.PositionName);
        switch (Position) {
            case "DEV":
                System.out.println("Nhân viên này là DEV");
                break;
            default:
                System.out.println("Nhân viên này không phải là DEV");
        }

        //Câu 8
        Account[] accounts = new Account[]{account1, account2};
        for (Account account : accounts) {
            System.out.println("FullName: " + account.fullName + ", Phòng Ban: " + account.position.PositionName + ", Email: " + account.email);

        }

        //Câu 9

        Department[] departments = new Department[] {department1, department2};
        for (Department department : departments) {
            System.out.println("ID Phòng Ban: " + department.departmentId + ", Tên Phòng Ban: " + department.departmentName);
        }

        //Câu 10
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Account thứ " + (i + 1) + " là: ");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Fullname: " + accounts[i].fullName);
            System.out.println("Department: " + accounts[i].department.departmentName);
        }

        //Câu 11
        for (int i = 0; i < departments.length; i++) {
            System.out.println("Department thứ " + (i + 1) + " là:");
            System.out.println("ID: " + departments[i].departmentId);
            System.out.println("Name: " + departments[i].departmentName);
        }

        //Câu 12
        for (int i = 0; i < 2; i++) {
            System.out.println("Department thứ " + (i + 1) + " là:");
            System.out.println("ID: " + departments[i].departmentId);
            System.out.println("Name: " + departments[i].departmentName);
        }

        //Câu 13
        for (int i = 0; i < departments.length; i++) {
            if (i != 1)
            {
                System.out.println("Department thứ " + (i + 1) + " là:");
                System.out.println("ID: " + departments[i].departmentId);
                System.out.println("Name: " + departments[i].departmentName);
            }
        }

        //Câu 16_10
        int i = 0;
        while (i < accounts.length) {
            System.out.println("Account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Fullname: " + accounts[i].fullName);
            System.out.println("Department: " + accounts[i].department.departmentName);
            i++;
        }


    }

}
