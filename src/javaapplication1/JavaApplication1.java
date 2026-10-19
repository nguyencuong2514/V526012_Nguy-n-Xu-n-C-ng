/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        System.out.println("=== KIEM TRA BAI TAP 1 ===");
        Diem d1 = new Diem(1, 2);
        Diem d2 = new Diem(4, 6);
        DuongThang dt = new DuongThang(d1, d2);
        System.out.println("Do dai duong thang: " + dt.tinhDoDai());

        System.out.println("\n=== KIEM TRA BAI TAP 2 ===");
        
        // Khởi tạo 2 TamGiac[cite: 4]
        TamGiac tg1 = new TamGiac(new Diem(0, 0), new Diem(3, 0), new Diem(0, 4));
        TamGiac tg2 = new TamGiac(new Diem(0, 0), new Diem(6, 0), new Diem(0, 8));

        System.out.println("--- Tam Giac ---");
        System.out.println("Tam giac 1 - Chu vi: " + tg1.tinhChuVi() + ", Dien tich: " + tg1.tinhDienTich());
        System.out.println("Tam giac 2 - Chu vi: " + tg2.tinhChuVi() + ", Dien tich: " + tg2.tinhDienTich());

        // Khởi tạo 2 ChuNhat[cite: 4]
        ChuNhat cn1 = new ChuNhat(4, 5);
        ChuNhat cn2 = new ChuNhat(6, 10);

        System.out.println("\n--- Hinh Chu Nhat ---");
        System.out.println("Hinh chu nhat 1 - Chu vi: " + cn1.tinhChuVi() + ", Dien tich: " + cn1.tinhDienTich());
        System.out.println("Hinh chu nhat 2 - Chu vi: " + cn2.tinhChuVi() + ", Dien tich: " + cn2.tinhDienTich());

        // Khởi tạo 2 HinhTron[cite: 4]
        HinhTron ht1 = new HinhTron(new Diem(0, 0), 3);
        HinhTron ht2 = new HinhTron(new Diem(1, 1), 5);

        System.out.println("\n--- Hinh Tron ---");
        System.out.println("Hinh tron 1 - Chu vi: " + ht1.tinhChuVi() + ", Dien tich: " + ht1.tinhDienTich());
        System.out.println("Hinh tron 2 - Chu vi: " + ht2.tinhChuVi() + ", Dien tich: " + ht2.tinhDienTich());
    }
}