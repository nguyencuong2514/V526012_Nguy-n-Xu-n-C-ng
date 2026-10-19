/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

public class BaiTapMang {

    // === BÀI 1 ===
    // Viết chương trình nhập vào n phần tử int của 1 mảng (n nhập từ bàn phím). Tính và in ra tổng[cite: 5]
    public static void giaiBai1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- BÀI 1 ---");
        System.out.print("Nhập số lượng phần tử n: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        int sum = 0;
        
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        System.out.println("Tổng các phần tử trong mảng là: " + sum);
    }

    // === BÀI 2 ===
    // Viết hàm nhận vào 2 mảng và in ra mảng tổng (có số phần tử bằng mảng nhiều phần tử hơn)[cite: 5]
    public static void giaiBai2(int[] arr1, int[] arr2) {
        System.out.println("\n--- BÀI 2 ---");
        int maxLength = Math.max(arr1.length, arr2.length);
        int[] result = new int[maxLength];
        
        System.out.print("Mảng tổng: [ ");
        for (int i = 0; i < maxLength; i++) {
            int val1 = (i < arr1.length) ? arr1[i] : 0;
            int val2 = (i < arr2.length) ? arr2[i] : 0;
            result[i] = val1 + val2;
            System.out.print(result[i] + " ");
        }
        System.out.println("]");
    }

    // === BÀI 3 ===
    // Viết chương trình nhập mảng bằng 1 chuỗi cách nhau bởi dấu cách. In ra số phần tử và tổng[cite: 5]
    public static void giaiBai3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- BÀI 3 ---");
        System.out.print("Nhập vào các số nguyên cách nhau bằng dấu cách (Ví dụ: 3 4 5 33 554 67 23 6 8 5): ");
        String input = scanner.nextLine().trim();
        
        if (input.isEmpty()) {
            System.out.println("Số phần tử: 0; Tổng: 0");
            return;
        }
        
        // Tách chuỗi dựa vào khoảng trắng
        String[] parts = input.split("\\s+");
        int count = parts.length;
        long sum = 0;
        
        for (String part : parts) {
            sum += Integer.parseInt(part);
        }
        
        System.out.println("Số phần tử: " + count + "; Tổng: " + sum);
    }

    // === HÀM MAIN CHẠY CHƯƠNG TRÌNH ===
    public static void main(String[] args) {
        // Chạy Bài 1
        giaiBai1();
        
        // Chạy Bài 2 (Ví dụ với 2 mảng có độ dài khác nhau)
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {10, 20, 30};
        giaiBai2(array1, array2);
        
        // Chạy Bài 3
        giaiBai3();
    }
}