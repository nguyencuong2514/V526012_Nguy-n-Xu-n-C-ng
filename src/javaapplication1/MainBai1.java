package javaapplication1;


public class MainBai1 {
    public static void main(String[] args) {
        Phanso p1 = new Phanso(2, 3);
        Phanso p2 = new Phanso(4, 6);

        System.out.println("Phan so 1: " + p1);
        System.out.println("Phan so 2: " + p2);

        System.out.println("Tong: " + p1.cong(p2));
        System.out.println("Hieu: " + p1.tru(p2));
        System.out.println("Tich: " + p1.nhan(p2));
        System.out.println("Thuong: " + p1.chia(p2));

        Phanso p3 = new Phanso(12, 18);
        p3.rutGon();
        System.out.println("Rut gon 12/18: " + p3);

        int kq = p1.soSanh(p2);

        if (kq > 0) {
            System.out.println("p1 > p2");
        } else if (kq < 0) {
            System.out.println("p1 < p2");
        } else {
            System.out.println("p1 = p2");
        }
    }
}

