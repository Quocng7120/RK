public class Ex5 {

    public static void main(String[] args) {

        soChan();

    }

    public static void soChan()
    {
        for (int i = 1; i < 10; i++)
        {
            if (i%2==0)
            {
                System.out.print(i + ", ");
            }
        }
    }

    public static void NhanVien(Account account)
    {
        System.out.println("ID là: " + account.accountID);
        System.out.println("FullName là: " + account.fullName);
    }
}
