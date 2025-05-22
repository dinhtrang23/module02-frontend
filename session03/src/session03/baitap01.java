package session03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class baitap01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========Nhập thông tin khách hàng========");
        System.out.print("Nhập vào tên khách hàng:");
        String custumerName = scanner.nextLine();
        System.out.print("Nhập vào tên sản phẩm:");
        String productName = scanner.nextLine();
        System.out.print("Nhập vào giá sản phẩm:");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập vào số lượng sản phẩm:");
        int quanlity = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào địa chỉ của bạn:");
        String address = scanner.nextLine();
        System.out.println("Bạn có phải là thành viên không?(true|false)");
        boolean isMember = Boolean.parseBoolean(scanner.nextLine());

        float totalPrice = price * quanlity;
        float discount = isMember ? totalPrice * 0.1F : 0;
        float vat = totalPrice * 0.08F;
        float totalAmount = totalPrice - discount + vat;
        System.out.println("===================HÓA ĐƠN=======================");
        System.out.println("Khách hàng:" + custumerName);
        System.out.println("Sản phẩm:" + productName);
        System.out.println("Số lượng:" + quanlity);
        System.out.printf("Đơn giá: %,10.2f VND\n",price);
        System.out.printf("Thành tiền: %,10.2f VND\n",totalPrice);
        System.out.printf("Giảm giá thành viên (10%%):%,10.2f VND\n",discount);
        System.out.printf("Tiền VAT(8%%): %,10.2f VND\n",vat);
        System.out.printf("Tổng thanh toán: %,10.2f VND\n",totalAmount);
    }

}
