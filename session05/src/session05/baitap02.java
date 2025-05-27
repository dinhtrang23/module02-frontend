package session05;

public class baitap02 {
    public static void main(String[] args) {
        StringBuilder originalString = new StringBuilder("Hello, Java World!");

        System.out.println("Chuỗi ban đầu: " + originalString);

        originalString.delete(5, 10); //Xóa chỉ bao gồm 5 không bao gồm 10
        System.out.println("Chuỗi sau khi xóa: " + originalString);

        int start = originalString.indexOf("World");
        if (start != -1) {
            originalString.replace(start, start + 5, "Universe"); // "World" có độ dài 5
        }
        System.out.println("Chuỗi sau khi thay thế: " + originalString);
    }
}
