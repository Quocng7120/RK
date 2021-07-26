import java.time.LocalDate;
import java.util.Scanner;

public class Testing_2_Ex2 {
    public static void main(String[] args) {



//        for (Account account: accounts)
//        {
//
//        }

        Integer l = new Integer(5000);

        float a = (float) l;
//        System.out.printf("%5.2f%n", a);

        String value = new String("1234567");
        int b = Integer.valueOf(value);
//        System.out.println(b);

        Integer inter = new Integer("1234567");
        int c = inter.intValue();
//        System.out.println(c);

        //Ex4_Q1
//        String chuoiNhapVao = new String("Nguyen Duy Quoc  Hoc Java");
//        int dem = 0;
//        for (int i = 0; i<chuoiNhapVao.length(); i++)
//        {
//            if (chuoiNhapVao.charAt(i)!= ' ' && chuoiNhapVao.charAt(i)!= '\n')
//            {
//                dem++;
//            }
//        }
//        System.out.println(dem);

        //Ex4_Q2

//        String s1 = new String("Nguyễn Duy ");
//        String s2 = new String("Quốc");
//
//        String s = new String();
//        s = s1 + s2;
//        System.out.println("Ex4_q2: " + s);

        //Ex4_Q3

//        String name = new String("quoc");
//        char[] chuCaiDau = new char[name.length()];
//        chuCaiDau = name.toUpperCase().toCharArray();
//        chuCaiDau[0] +=32;
//        for (int i=1; i<name.length(); i++)
//        {
//            chuCaiDau[i]+=32;
//        }
//        System.out.println(chuCaiDau);



//        System.out.println("nhập vào chuỗi");
//        Scanner scanner = new Scanner(System.in);
//        String string = scanner.nextLine().trim();
//        scanner.close();
//        // cắt chuỗi
//        String[] array = string.split(" ");
//        // so sánh kí tự đầu tiên với số 91, tra bảng mã ASCII  sẽ rõ
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].charAt(0) < 91) {
//                System.out.println(" chữ cái đầu của từ " + array[i] + " viết hoa");
//            } else {
//                System.out.println("chữ cái đầu của từ " + array[i] + " không viết hoa");
//            }
//        }

        //Ex4_Q4
//        System.out.println("nhập vào chuỗi");
//        Scanner scanner = new Scanner(System.in);
//        String tenNhap = scanner.nextLine().trim();
//        scanner.close();
//        char[] charTen = new char[tenNhap.length()];
//        charTen = tenNhap.toUpperCase().toCharArray();
//        for (int i = 0; i < tenNhap.length(); i++)
//        {
//            System.out.println("Ki tu thu " + i + " la: " + charTen[i]);
//        }


        //Ex4_Q5
//        System.out.println("nhập vào Họ");
//        Scanner scanner = new Scanner(System.in);
//        Scanner scanner1 = new Scanner(System.in);
//        String sHo = scanner.nextLine().trim();
//
//        System.out.println("nhập vào tên");
//        String sTen = scanner1.nextLine().trim();
//        scanner.close();
//        sHo =sHo + " " + sTen;
//        System.out.println(sHo);

        //Ex4_Q6
//        String fullName = new String("Nguyễn Duy Quốc");
//        String[] array = fullName.split(" ");
//        for (String arr : array)
//        {
//            System.out.print(arr);
//
//        }

        // create group
        Group group1 = new Group();
        group1.groupID = 1;
        group1.groupName = "Java Fresher";

        Group group2 = new Group();
        group2.groupID = 2;
        group2.groupName = "C# Fresher";

        Group group3 = new Group();
        group3.groupID = 3;
        group3.groupName = "Java Pro Java";


        // Ex4_Q8

//        Group[] groups = new Group[] {group1, group2, group3};
//        for (Group group : groups)
//        {
//
//            String[] arr = group.groupName.split(" ");
//            for(String arr1 : arr)
//            {
//                if(arr1.equals("Java"))
//                {
//                    System.out.println(group.groupName);
//                    break;
//                }
//            }
//        }

        //Ex4_Q10
//        kiemTraChuoiDao("quoc", "cuuq");

        //Ex4_Q11
        soLanXuatHienA("Nguyen Duy Quoc Da Tro Thanh mot nguoi thanh cong");


    }

    public static void kiemTraChuoiDao(String s1, String s2)
    {
        char[] cs1 = s1.toLowerCase().toCharArray();
        char[] cs2 = s2.toLowerCase().toCharArray();
        if (s1.length() != s2.length())
        {
            System.out.println("KO");
        }
        else
        {
            boolean kt = true;
            for (int i = 0; i < cs1.length; i++)
            {
                if (cs1[i] != cs2[cs2.length-i-1])
                    kt = false;
            }

            if (kt)
                System.out.println("OK");
            else
                System.out.println("KO");
        }
    }

    public static void soLanXuatHienA(String string)
    {
        char[] chars = string.toLowerCase().toCharArray();
        int soLanXuatHien = 0;
        for(char ca : chars)
        {
            if (ca == 'a')
                soLanXuatHien++;
        }

        System.out.println("Số lần chữ a xuất hiện là: " + soLanXuatHien);
    }
}
