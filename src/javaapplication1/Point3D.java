package javaapplication1;

public class Point3D extends Point2D {
    private double z;

    // Ham tao
    public Point3D() {
        super();
        this.z = 0;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    // Getter va Setter
    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    // Tinh khoang cach giua hai diem 3D
    public double distance(Point3D p) {
        double dx = getX() - p.getX();
        double dy = getY() - p.getY();
        double dz = this.z - p.z;

        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    // Ghi de phuong thuc doi xung
    @Override
    public Point3D symmetric() {
        return new Point3D(-getX(), -getY(), -z);
    }

    // Tinh tien diem trong khong gian 3D
    public void translate(double dx, double dy, double dz) {
        super.translate(dx, dy);
        this.z += dz;
    }

    // Hien thi diem 3D
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}

