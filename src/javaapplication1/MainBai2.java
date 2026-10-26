package javaapplication1;
import java.util.Scanner;

public class MainBai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Nhap tap hop phan so
        System.out.print("Nhap so luong phan so: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println(
                "So luong phan so phai lon hon 0"
            );
            sc.close();
            return;
        }

        Phanso[] ds = new Phanso[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan so thu " + (i + 1));

            System.out.print("Tu so: ");
            int tu = sc.nextInt();

            int mau;
            do {
                System.out.print("Mau so: ");
                mau = sc.nextInt();

                if (mau == 0) {
                    System.out.println(
                        "Mau so phai khac 0. Nhap lai!"
                    );
                }
            } while (mau == 0);

            ds[i] = new Phanso(tu, mau);
        }

        // In danh sach phan so
        System.out.println("\nDanh sach phan so:");
        for (int i = 0; i < n; i++) {
            System.out.print(ds[i] + " ");
        }

        // 2. Tim phan so lon nhat
        Phanso max = ds[0];

        for (int i = 1; i < n; i++) {
            if (ds[i].soSanh(max) > 0) {
                max = ds[i];
            }
        }

        System.out.println(
            "\nPhan so lon nhat: " + max
        );

        // 3. Tinh tong cac phan so
        Phanso tong = new Phanso(0, 1);

        for (int i = 0; i < n; i++) {
            tong = tong.cong(ds[i]);
        }

        System.out.println("Tong cac phan so: " + tong);

        // 4. Dem phan so khong phai so nguyen
        int dem = 0;

        for (int i = 0; i < n; i++) {
            if (ds[i].getTuSo() % ds[i].getMauSo() != 0) {
                dem++;
            }
        }

        System.out.println(
            "So phan so khong phai so nguyen: " + dem
        );

        sc.close();
    }
}
