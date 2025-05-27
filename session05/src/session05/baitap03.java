package session05;

import java.util.Scanner;

public class baitap03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ người dùng
        System.out.print("Nhập vào một chuỗi: ");
        String inputString = scanner.nextLine();

        // Thay thế tất cả các ký tự số (0-9) bằng ký tự '*'
        String replacedString = inputString.replaceAll("[0-9]", "*");

        // In kết quả
        System.out.println("Chuỗi sau khi thay thế: " + replacedString);

        // Đóng Scanner
        scanner.close();
    }
}
