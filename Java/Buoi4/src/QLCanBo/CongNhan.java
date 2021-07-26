package QLCanBo;

public class CongNhan extends CanBo{
    private int bac;

    public CongNhan() {
    }

    public CongNhan(int bac) {
        this.bac = bac;
    }

    public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }
}
