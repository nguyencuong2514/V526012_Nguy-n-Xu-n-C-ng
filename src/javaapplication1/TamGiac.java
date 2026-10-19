/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

public class TamGiac {
    private Diem A, B, C;

    public TamGiac(Diem A, Diem B, Diem C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    private double tinhKhoangCach(Diem p1, Diem p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    public double tinhChuVi() {
        double a = tinhKhoangCach(B, C);
        double b = tinhKhoangCach(A, C);
        double c = tinhKhoangCach(A, B);
        return a + b + c;
    }

    public double tinhDienTich() {
        double a = tinhKhoangCach(B, C);
        double b = tinhKhoangCach(A, C);
        double c = tinhKhoangCach(A, B);
        double p = tinhChuVi() / 2.0; 
        return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // Công thức Heron
    }
}
