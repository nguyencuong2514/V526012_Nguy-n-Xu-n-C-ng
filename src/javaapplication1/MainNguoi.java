package javaapplication1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MainNguoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng nhân viên: ");
        int n = sc.nextInt();

        NhanVien[] ds = new NhanVien[n];

        // Nhập danh sách nhân viên
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhân viên thứ " + (i + 1));
            ds[i] = new NhanVien();
            ds[i].nhap(sc);
        }

        // Tìm nhân viên có số năm công tác lớn nhất
        NhanVien max = ds[0];
        for (int i = 1; i < n; i++) {
            if (ds[i].getSnct() > max.getSnct()) {
                max = ds[i];
            }
        }

        System.out.println("\n===== Nhân viên có số năm công tác nhiều nhất =====");
        max.xuat();

        // Sắp xếp theo lương giảm dần
        Arrays.sort(ds, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                return Double.compare(nv2.tinhLuong(), nv1.tinhLuong());
            }
        });

        System.out.println("\n===== Danh sách nhân viên theo lương giảm dần =====");
        for (NhanVien nv : ds) {
            nv.xuat();
            System.out.println("--------------------");
        }

        sc.close();
    }
}
