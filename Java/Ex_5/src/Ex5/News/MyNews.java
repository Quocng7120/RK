package Ex5.News;

import java.util.Scanner;

public class MyNews {
    public static void main(String[] args) {

        News news = new News();

        Scanner scanner = new Scanner(System.in);
        byte choose;
        System.out.println("Bạn muốn sử dụng chức năng nào? (1:Insert news || 2: View list news || 3: Average rate || 4: Exit) ");
        choose = scanner.nextByte();
        switch (choose) {
            case 1:
                news.Insert();
                break;
            case 2:
                news.Display();
                break;
            case 3:
                news.Calculate();
                news.Display();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Nhập sai !");
                break;
        }

        scanner.close();
    }
}
