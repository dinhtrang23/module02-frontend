package session05;

import java.util.Scanner;

public class baitap01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi văn bản: ");
        String text = scanner.nextLine().trim();
        System.out.print("Nhập từ cần tìm: ");
        String wordToFind = scanner.nextLine().trim();
        int index = text.indexOf(wordToFind);
        if (index != -1) {
            System.out.println("Từ \"" + wordToFind + "\" xuất hiện tại vị trí: " + index);
        } else {
            System.out.println("Từ \"" + wordToFind + "\" không xuất hiện trong chuỗi.");
        }
        scanner.close();
    }

}
