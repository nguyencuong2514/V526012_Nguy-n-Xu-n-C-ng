package javaapplication1;


public class Point2D {
    // Thuoc tinh
    private double x;
    private double y;

    // Ham tao
    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setter
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Tinh khoang cach giua hai diem
    public double distance(Point2D p) {
        double dx = this.x - p.x;
        double dy = this.y - p.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    // Tim diem doi xung qua goc toa do
    public Point2D symmetric() {
        return new Point2D(-x, -y);
    }

    // Tinh tien diem
    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    // Hien thi diem
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

