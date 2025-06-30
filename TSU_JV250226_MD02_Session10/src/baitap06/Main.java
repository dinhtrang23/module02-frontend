package baitap06;

import baitap04.InputData3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        OrderManager manager = new OrderManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            // Hiển thị menu
            System.out.println("\n*************** MENU QUẢN LÝ ĐƠN HÀNG ***************");
            System.out.println("1. Thêm đơn hàng");
            System.out.println("2. Sửa đơn hàng");
            System.out.println("3. Xóa đơn hàng");
            System.out.println("4. Hiển thị danh sách đơn hàng");
            System.out.println("5. Thoát");

            try {
                choice = InputData3.getInt(scanner,"Lựa chọn của bạn: ");

                switch (choice) {
                    case 1:
                        // Thêm đơn hàng
                        String orderCode = InputData3.getString(scanner,"Nhập mã đơn hàng: ");
                        String customerName = InputData3.getString(scanner,"Nhập tên khách hàng: ");
                        Order order = new Order(orderCode, customerName);
                        manager.add(order);
                        System.out.println("Đơn hàng đã được thêm thành công.");
                        break;

                    case 2:
                        // Sửa đơn hàng
                        manager.display();
                        String orderCodeUpdate = InputData3.getString(scanner,"Nhập mã đơn hàng cần sửa: ");
                        int indexUpdate = - 1 ;
                        for (int i = 0 ; i < manager.orders.size() ; i++) {
                            if(manager.orders.get(i).getOrderCode().equalsIgnoreCase(orderCodeUpdate)){
                                indexUpdate = i;
                                break;
                            }
                        }
                        if(indexUpdate == -1){
                            System.out.println("Không tìm thấy đơn hàng nào có mã = " + orderCodeUpdate);
                        }else {

                            String newCustomerName = InputData3.getString(scanner,"Nhập tên khách hàng mới: ");
                            manager.update(indexUpdate, new Order(orderCodeUpdate, newCustomerName));
                            System.out.println("Đơn hàng đã được sửa thành công.");
                        }

                        break;

                    case 3:
                        // Xóa đơn hàng
                        manager.display();
                        String orderCodeDelete = InputData3.getString(scanner,"Nhập mã đơn hàng cần xóa: ");
                        int indexDelete = - 1 ;
                        for (int i = 0 ; i < manager.orders.size() ; i++) {
                            if(manager.orders.get(i).getOrderCode().equalsIgnoreCase(orderCodeDelete)){
                                indexDelete = i;
                                break;
                            }
                        }
                        if(indexDelete == -1){
                            System.out.println("Không tìm thấy đơn hàng nào có mã = " + orderCodeDelete);
                        }else {
                            manager.delete(indexDelete);
                            System.out.println("Đơn hàng đã được xóa thành công.");
                        }
                        break;

                    case 4:
                        // Hiển thị danh sách đơn hàng
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
            } catch (NumberFormatException e) {
                System.out.println("Lỗi nhập liệu! Vui lòng chọn một số hợp lệ.");
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
