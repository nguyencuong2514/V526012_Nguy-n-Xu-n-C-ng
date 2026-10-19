/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

public class DuongThang {
    private Diem A;
    private Diem B;

    public DuongThang(Diem A, Diem B) {
        this.A = A;
        this.B = B;
    }

    public Diem getA() {
        return A;
    }

    public Diem getB() {
        return B;
    }

    public double tinhDoDai() {
        return Math.sqrt(Math.pow(B.getX() - A.getX(), 2) + Math.pow(B.getY() - A.getY(), 2));
    }
}
