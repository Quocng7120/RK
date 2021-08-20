package vti.frontend;

import vti.backend.presentationlayer.UserController;
import vti.entity.User;
import vti.utils.ScannerUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Function {
    private UserController userController;

    public Function() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
        userController = new UserController();
    }




    public User login() {
        while (true) {
            System.out.print("Mời bạn nhập vào Email của account: ");
            String email = ScannerUtils.inputEmail("Email chưa đúng định dạng.");

            System.out.print("Mời bạn nhập password: ");
            String password = ScannerUtils
                    .inputPassword("Password phai dai tu 6--> 12 ki tu va co it nhat 1 chu viet hoa!");
            try {
                return userController.login(email, password);

            } catch (Exception e) {
                System.err.println(e.getMessage() + "\n");
            }
        }
    }

    public void getListAllUsersInProject() throws ClassNotFoundException, SQLException, IOException {
        List<User> users = userController.getListAllUsersInProject();
        System.out.printf("%-15s %-25s %-25s %-25s\n", "ID", "Email", "Fullname", "Password");
        for (User user : users) {
            System.out.printf("%-15s %-25s %-25s %-25s\n", user.getId(), user.getEmail(), user.getFullName(),
                    "*********");
        }
    }

    public void getListUsersInProject() throws ClassNotFoundException, SQLException, IOException {

        int projectId;
        System.out.print("Mời bạn nhập vào id: ");
        projectId = ScannerUtils.inputPositiveInt("Bạn phải nhập vào số nguyên dương! Mời nhập lại");

        List<User> users = userController.getListUsersInProject(projectId);
        System.out.printf("%-15s %-25s %-25s %-25s\n", "ID", "Email", "Fullname", "Password");
        for (User user : users) {
            System.out.printf("%-15s %-25s %-25s %-25s\n", user.getId(), user.getEmail(), user.getFullName(),
                    "*********");
        }
    }
}
