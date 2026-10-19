/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 20;
        long t1 = 0, t2 = 1;

        System.out.println("20 so dau tien cua day Fibonacci la:");
        
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " ");

            // Tính số tiếp theo trong dãy
            long sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}