package vti.frontend;

import vti.entity.User;
import vti.utils.ScannerUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        menuLogin();
    }

    private static void menuLogin() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
        Function function = new Function();
        System.out.println("MỜI BẠN LOGIN");
        User user = function.login();
        System.out.println("Login successfull!");
        System.out.println("Chào mừng " + user.getFullName() + "!");
        menuAdmin();
    }

    private static void menuAdmin()
            throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
        Function function = new Function();
        System.out.println("Moi ban nhap chuc nang muon su dung:\n" + "1: In ra danh sách User của Project theo ProjectID\n"
                + "2: In ra tất cả các Manager của các project\n"+ "3: Thoat khoi chuong trinh\n ");

        while (true) {
            System.out.print("Moi ban nhap chuc nang: ");
            int choose = ScannerUtils.inputFunction(1, 3, "Ban chi duoc chon tu 1 --> 3. Mời nhập lại!");

            switch (choose) {
                case 1:
                    function.getListUsersInProject();
                    break;
                case 2:
                    function.getListAllUsersInProject();
                    break;
                case 3:
                    System.out.println("bạn đã thoát khỏi chương trình!");
                    return;
            }
        }
    }
}
