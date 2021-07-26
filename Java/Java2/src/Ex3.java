import java.time.LocalDate;

public class Ex3 {

    public static void main(String[] args) {

        Account account1 = new Account();
        account1.accountID = 1;
        account1.email = "haidnag@gmail.com";
        account1.fullName = "Nguyễn Hải Đăng";
        account1.CreateDate = LocalDate.now();
        account1.username = "haidangproductions";

        Ex5.NhanVien(account1);
    }
}
