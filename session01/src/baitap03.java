import java.util.Scanner;

public class baitap03 {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner  scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính của hình tròn: ");
        radius = scanner.nextDouble();
        area = Math.PI * radius * radius; // Công thức tính diện tích
        System.out.printf("Diện tích hình tròn có bán kính %.2f là: %.2f%n", radius, area);
        scanner.close();
    }
}
