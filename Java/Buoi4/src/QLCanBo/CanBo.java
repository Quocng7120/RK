package QLCanBo;

import java.util.Scanner;

public class CanBo {
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;

    public CanBo() {
    }

    public CanBo(String hoTen, int tuoi, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void getAll() {
        System.out.println("Họ tên      : " + hoTen);
        System.out.println("Tuổi        : " + tuoi);
        System.out.println("Giới tính   : " + gioiTinh);
        System.out.println("Địa chỉ     : " + diaChi);
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập họ tên: ");
        hoTen = scanner.nextLine();

        System.out.println("Nhập tuổi: ");
        tuoi = scanner.nextByte();

        System.out.println("Nhập giới tính: ");
        setGioiTinh(scanner.nextLine());

        System.out.println("Nhập địa chỉ: ");
        diaChi = scanner.nextLine();
    }
}
