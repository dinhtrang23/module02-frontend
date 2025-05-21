package session03;

import java.util.Scanner;

public class baitap02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStudent = 0;
        float avgScore = 0;
        float maxScore = Float.MIN_VALUE;
        float minScore = Float.MAX_VALUE;
        float totalScore = 0;
        do {
            System.out.println("=======MENU===========");
            System.out.println("1. Nhập điểm học viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Thoát");
            System.out.println("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("----Nhập -1 để dừng----");
                        System.out.print("Nhập điểm học viên:");
                        float score = Float.parseFloat(scanner.nextLine());
                        if (score == -1) {
                            break;
                        }
                        if (score >= 0 && score <= 10) {
                            if (score < 5) {
                                System.out.println("Xếp loại học lực yếu");
                            } else if (score <= 7) {
                                System.out.println("Xếp loại học lực trung bình");
                            } else if (score < 8) {
                                System.out.println("Xếp loại học lục khá");
                            } else if (score <= 9) {
                                System.out.println("Xếp loại học lục giỏi");
                            } else {
                                System.out.println("Xếp loại học lục xuất sắc");
                            }
                            countStudent++;
                            totalScore += score;
                            if (maxScore < score) {
                                maxScore = score;
                            }
                            if (minScore > score) {
                                minScore = score;
                            }
                        } else {
                            System.err.println("Điểm không hợp lệ");
                        }
                    }
                    break;
                case 2:
                    if (countStudent == 0) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        System.out.println("---KẾT QUẢ-----");
                        System.out.println("Số học viên đã nhập : " + countStudent);
                        System.out.printf("Điểm trung bình : %.2f\n", totalScore / countStudent);
                        System.out.printf("Điểm cao nhất : %.2f\n", maxScore);
                        System.out.printf("Điểm thấp nhất : %.2f\n", minScore);
                    }
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng chọn từ 1-3:");
            }

        } while (true);

    }

}

