package session03;

import java.util.Scanner;

public class baitap03 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int countEmployees = 0;
        double maxSalary = Double.MIN_VALUE;
        double minSalary = Double.MAX_VALUE;
        double totalSalary = 0;
        double totalBonus = 0;

    do{
        System.out.println("=======MENU===========");
        System.out.println("1. Nhập lương nhân viên");
        System.out.println("2. Hiển thị thống kê");
        System.out.println("3. Tính tổng số tiền thưởng cho nhân viên");
        System.out.println("4. Thoát");
        System.out.println("Lựa chọn của bạn:");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                while (true) {
                    System.out.println("----Nhập -1 để dừng----");
                    System.out.print("Nhập lương nhân viên:");
                    double salary = Double.parseDouble(scanner.nextLine());
                    if (salary == -1) {
                        break;
                    }
                    if (salary >= 0 && salary <= 500000000) {
                        if (salary < 5000000) {
                            System.out.println("Thu nhập thấp");
                        } else if (salary < 15000000) {
                            System.out.println("Thu nhập trung bình");
                        } else if (salary < 50000000) {
                            System.out.println("Thu nhập khá");
                        } else {
                            System.out.println("Thu nhập cao");
                        }
                        double bonus = bonusSalary(salary);
                        totalBonus += bonus;
                        countEmployees++;
                        totalSalary += salary;
                        if (maxSalary < salary) {
                            maxSalary = salary;
                        }
                        if (minSalary > salary) {
                            minSalary = salary;
                        }
                    } else {
                        System.err.println("Lương không hợp lệ");
                    }
                }
                break;
                case 2:
                    if (countEmployees == 0) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        System.out.println("---KẾT QUẢ-----");
                        System.out.println("Số nhân viên đã nhập : " + countEmployees);
                        System.out.printf("Tổng lương : %,d VND\n", (int)totalSalary);
                        System.out.printf("Lương trung bình : %,d VND\n", (int)totalSalary / countEmployees);
                        System.out.printf("Lương cao nhất : %,d VND\n", (int)maxSalary);
                        System.out.printf("Lương thấp nhất : %,d VND\n", (int)minSalary);
                    }
                    break;
                    case 3:
                        System.out.printf("Tổng tiền thưởng cho %d nhân viên là: %,d VND\n", countEmployees, (int)totalBonus);
                        break;
            case 4:
                System.out.println("Kết thúc chương trình");
                System.exit(0);
                break;
            default:
                System.err.println("Vui lòng chọn từ 1-4:");
        }

    }while (true);
    }
    public static double bonusSalary(double salary) {
        if (salary < 5_000_000) {
            return salary * 0.05;
        } else if (salary < 15_000_000) {
            return salary * 0.10;
        } else if (salary < 50_000_000) {
            return salary * 0.15;
        } else if (salary < 100_000_000) {
            return salary * 0.20;
        } else {
            return salary * 0.25;
        }
    }
}
