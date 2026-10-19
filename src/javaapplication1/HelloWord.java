/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner; // Thêm thư viện để đọc dữ liệu từ bàn phím

public class HelloWord{

    public static void main(String[] args) {
        // Tạo đối tượng
        Scanner scanner = new Scanner(System.in);

        // In ra

        //gõ tên
        String name = scanner.nextLine();

        // In ra lời chào kèm theo tên bạn vừa nhập
        System.out.println("Hello " + name);
        
        scanner.close();
    }
}