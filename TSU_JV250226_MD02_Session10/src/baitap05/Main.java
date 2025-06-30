package baitap05;

import baitap04.InputData3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InvoiceManager manager = new InvoiceManager();
        Scanner scanner = new Scanner(System.in);
        int currentId = 1 ;
        int choice;

        while (true) {
            // Hiển thị menu
            System.out.println("\n*************** MENU QUẢN LÝ HÓA ĐƠN ***************");
            System.out.println("1. Thêm hóa đơn");
            System.out.println("2. Sửa hóa đơn");
            System.out.println("3. Xóa hóa đơn");
            System.out.println("4. Hiển thị danh sách hóa đơn");
            System.out.println("5. Thoát");

            choice = InputData3.getInt(scanner,"Lựa chọn của bạn: ");

            switch (choice) {
                case 1:
                    // Thêm hóa đơn
                    String invoiceCode = InputData3.getString(scanner ,"Nhập mã hóa đơn: ");
                    double amount = InputData3.getDouble(scanner,"Nhập số tiền: ");
                    Invoice invoice = new Invoice(invoiceCode, amount ,currentId++);
                    manager.add(invoice);
                    System.out.println("Hóa đơn đã được thêm thành công.");
                    break;

                case 2:
                    // Sửa hóa đơn
                    manager.display();
                    int idUpdate = InputData3.getInt(scanner ,"Nhập id hóa đơn cần sửa: ");
                    int indexUpdate = -1 ;
                    for (int i = 0 ; i < currentId-1 ; i++) {
                        if(manager.invoices.get(i).getId() == idUpdate) {
                            indexUpdate = i;
                            break;
                        }
                    }
                    if(indexUpdate == -1) {
                        System.out.println("Không tìm thấy hóa đơn nào có id = " + idUpdate);
                    }else {
                        String newInvoiceCode = InputData3.getString(scanner , "Nhập mã hóa đơn mới: ");
                        double newAmount = InputData3.getDouble(scanner , "Nhập số tiền mới: ");
                        manager.update(indexUpdate, new Invoice(newInvoiceCode, newAmount,idUpdate));
                        System.out.println("Hóa đơn đã được sửa thành công.");
                    }

                    break;

                case 3:
                    // Xóa hóa đơn
                    manager.display();
                    int idDelete = InputData3.getInt(scanner ,"Nhập id hóa đơn cần xóa: ");
                    int indexDelete = -1 ;
                    for (int i = 0 ; i < currentId-1 ; i++) {
                        if(manager.invoices.get(i).getId() == idDelete) {
                            indexDelete = i;
                            break;
                        }
                    }
                    if(indexDelete == -1) {
                        System.out.println("Không tìm thấy hóa đơn nào có id = " + idDelete);
                    }else {
                        manager.delete(indexDelete);
                        System.out.println("Hóa đơn đã được xoa thành công.");
                    }

                    break;

                case 4:
                    // Hiển thị danh sách hóa đơn
                    manager.display();
                    break;

                case 5:
                    // Thoát chương trình
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
            }

        }
    }
}
