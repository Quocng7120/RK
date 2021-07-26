package Ex5.SV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh{
    private Scanner scanner;

    private List<SinhVien> sinhViens;

    public TuyenSinh() {
        sinhViens = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    @Override
    public void themThiSinh() {
        System.out.println("Nhập số thí sinh muốn nhập: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            SinhVien sinhVien = new SinhVien();
            sinhVien.nhap(sinhVien);
            sinhVien.nhap(sinhVien);
        }
    }

    @Override
    public void hienThiSinh() {
        for (SinhVien sinhVien : sinhViens) {
            System.out.println(sinhVien);
        }
    }

    @Override
    public void timThiSinh() {

        System.out.println("Nhập sbd cần tìm: ");
        String sbd = scanner.nextLine();

        for (SinhVien sinhVien : sinhViens) {
            if (sinhVien.getSbd().equals(sbd)) {
                System.out.println(sinhVien);
            }
        }
    }

}
