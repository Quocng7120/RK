package vti.frontend;


import vti.backend.businesslayer.UserService;
import vti.backend.datalayer.ProjectRepository;
import vti.backend.datalayer.UserRepository;
import vti.backend.presentationlayer.UserController;
import vti.utils.ScannerUtils;

import java.io.IOException;
import java.sql.SQLException;

public class TestPRo {



    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
//        Testback testback = new Testback();
//        testback.databaseconnect();
//        testback.q2();

//        Testlist testlist = new Testlist();
//        testlist.Printlist();
//        menuAdmin();
//
//        System.out.println("// Looks like a comment");

//        ProjectRepository projectRepository = new ProjectRepository();
//        UserRepository userRepository = new UserRepository();
//
//        System.out.println(projectRepository.getProjectById(1).toString());
//        System.out.println(projectRepository.getManagerProject());

//        for (Integer userid : projectRepository.getManagerProject()){
//            System.out.println(userRepository.getUserById(userid).toString());
//        }
//
//        UserRepository userRepository = new UserRepository();
//        System.out.println(userRepository.getUserById(2).toString());

        UserController userController = new UserController();

//        System.out.println(userController.getListUsersInProject(1).toString());

        UserService userService = new UserService();
        System.out.println(userService.getListUsersInProject(1).toString());


    }

    private static void menuAdmin() {
        System.out.println("Moi ban nhap chuc nang muon su dung:\n" + "1: In ra danh sách các User\n"
                + "2: Tìm user theo ID\n" + "3: Xóa user theo id\n" + "4: Login\n" + "5: Thoat khoi chuong trinh\n ");

        while (true) {
            System.out.print("Moi ban nhap chuc nang: ");
            int choose = ScannerUtils.inputFunction(1, 5, "Ban chi duoc chon tu 1 --> 5. Mời nhập lại!");

            switch (choose) {
                case 1:
                    System.out.println("chọn: " + choose);
                    break;
                case 2:
                    System.out.println("chọn: " + choose);
                    break;
                case 3:
                    System.out.println("chọn: " + choose);
                    break;
                case 4:
                    System.out.println("chọn: " + choose);
                    break;
                case 5:
                    System.out.println("bạn đã thoát khỏi chương trình!");
                    return;
            }
        }
    }
}
