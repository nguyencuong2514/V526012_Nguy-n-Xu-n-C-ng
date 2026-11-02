import java.util.Scanner;

class Nguoi {
    protected String hoTen;
    protected int tuoi;

    public void nhap(Scanner sc) {
        sc.nextLine(); // xóa bộ đệm

        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        tuoi = sc.nextInt();
    }

    public void xuat() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
    }
}

class NhanVien extends Nguoi {
    private int snct;      // số năm công tác
    private double hsl;    // hệ số lương

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.print("Nhập số năm công tác: ");
        snct = sc.nextInt();

        System.out.print("Nhập hệ số lương: ");
        hsl = sc.nextDouble();
    }

    public double tinhLuong() {
        double lcb = 1.5;
        double phuCap = 0.2 * snct;
        return lcb * hsl + phuCap;
    }

    public int getSnct() {
        return snct;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Số năm công tác: " + snct);
        System.out.println("Hệ số lương: " + hsl);
        System.out.println("Tiền lương: " + tinhLuong() + " triệu");
    }
}