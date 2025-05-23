package session06;

import com.sun.source.util.SourcePositions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class baitap02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullname = "";
        String email = "";
        String phone = "";
        String password = "";
        do {
            System.out.println("**********QUẢN LÝ NGƯỜI DÙNG***********");
            System.out.println("1. Nhập thông tin người dùng");
            System.out.println("2. Chuẩn hóa họ tên");
            System.out.println("3. Kiểm tra email hợp lệ");
            System.out.println("4. Kiểm tra số điện thoại hợp lệ");
            System.out.println("5. Kiểm tra mật khẩu hợp lệ");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập thông tin họ và tên:");
                    fullname = scanner.nextLine();
                    System.out.println("Nhập email");
                    email = scanner.nextLine();
                    System.out.println("Nhập phone");
                    phone = scanner.nextLine();
                    System.out.println("Nhập password");
                    password = scanner.nextLine();
                    break;
                case 2:
                    String[] arrStr = fullname.trim().replaceAll("\\s+", "\\s").split(" ");
                    //String fullNameStandization="";
                    StringBuilder fullNameStandization = new StringBuilder();
                    for (int i = 0; i < arrStr.length; i++) {
                        fullNameStandization.append(Character.toUpperCase(arrStr[i].charAt(0))).append(arrStr[i].substring(1).toLowerCase()).append(" ");

                    }
                    System.out.println("Tên sau khi chuẩn hóa:" + fullNameStandization.toString().trim());
                    break;
                case 3:
                    //String emailRegex ="\\w{6,}@\\w{3,}.\\w{2,3}";
                    String emailRegex = "(?=.*[a-zA-Z0-9.-])@(?=.*[a-zA-Z0-9-.]).[a-z]{2,3}";
                    boolean result = Pattern.matches(emailRegex, email);
                    if (result) {
                        System.out.println("email hợp lệ");
                    } else {
                        System.out.println("email không hợp lệ");
                    }
                    break;
                case 4:
                    String phoneRegex = "(\\+84|09|03|08)(0|1|2|8|5)\\d{7}";
                    if (Pattern.matches(phoneRegex, phone)) {
                        System.out.println("Phone hợp lệ");

                    } else {
                        System.out.println("Phone không họp lệ");
                    }
                    break;
                case 5:
                    String passwordRegex = "(?=.*[a-z])(?=.*[A-Z])(?=.*[\\d])(?=.*[!@#$%^&*])[a-zA-z\\d!@#$%^&]{8,}";
                    if (Pattern.matches(passwordRegex, password)) {
                        System.out.println("Password hợp lệ, password mạnh");
                    }else{
                        System.out.println("Password không hợp lệ");
                    }
                        break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng chọn từ 1-6");

            }


        } while (true);
    }
}
