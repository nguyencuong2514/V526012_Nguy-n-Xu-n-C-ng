package javaapplication1;

import java.util.ArrayList;

public class MainPoint {
    public static void main(String[] args) {

        // 1. Tao danh sach diem 2D va 3D
        ArrayList<Point2D> list = new ArrayList<>();

        list.add(new Point2D(1, 2));
        list.add(new Point2D(3, 4));
        list.add(new Point2D(5, 6));

        list.add(new Point3D(1, 2, 3));
        list.add(new Point3D(4, 5, 6));
        list.add(new Point3D(7, 8, 9));

        // 2. Tinh tong khoang cach diem 2D va 3D
        double sum2D = 0;
        double sum3D = 0;

        Point2D previous2D = null;
        Point3D previous3D = null;

        for (Point2D p : list) {

            if (p instanceof Point3D) {
                Point3D p3 = (Point3D) p;

                if (previous3D != null) {
                    sum3D += previous3D.distance(p3);
                }

                previous3D = p3;

            } else {
                if (previous2D != null) {
                    sum2D += previous2D.distance(p);
                }

                previous2D = p;
            }
        }

        System.out.println("Tong khoang cach cac diem 2D: "
                + sum2D);

        System.out.println("Tong khoang cach cac diem 3D: "
                + sum3D);

        // 3. Them cac diem doi xung vao danh sach
        // Tao danh sach tam de tranh lap lai cac diem moi
        ArrayList<Point2D> symmetricList = new ArrayList<>();

        for (Point2D p : list) {
            symmetricList.add(p.symmetric());
        }

        // Them diem doi xung vao danh sach ban dau
        list.addAll(symmetricList);

        // 4. Hien thi danh sach diem
        System.out.println("\nDanh sach diem sau khi them doi xung:");

        for (Point2D p : list) {

            if (p instanceof Point3D) {
                System.out.println("Diem 3D: " + p);
            } else {
                System.out.println("Diem 2D: " + p);
            }
        }
    }
}

