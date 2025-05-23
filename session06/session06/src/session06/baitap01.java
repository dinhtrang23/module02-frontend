package session06;

import java.util.Scanner;

public class baitap01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] scores = new float[100];
        int currentIndex = 0;
        do {
            System.out.println("********QUẢN LÝ SINH VIÊN************");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. In danh sách điểm");
            System.out.println("3.Tính điểm trung bình của các sinh viên");
            System.out.println("4.Tính điểm cao nhất và thấp nhất");
            System.out.println("5.Đêm số lượng sinh viên đạt và trượt");
            System.out.println("6.Sắp xếp điểm tăng dần");
            System.out.println("7.Thống kê số lượng sinh viên giỏi và xuất sắc");
            System.out.println("8.Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Ban muốn nhập điểm bao nhiêu sinh viên");
                    int cntStudents = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < cntStudents; i++) {
                        System.out.println("Nhập điểm sinh viên thứ:" + (i + 1));
                        scores[currentIndex] = Float.parseFloat(scanner.nextLine());
                        currentIndex++;
                    }

                    break;
                case 2:
                    System.out.println("Danh sách điểm sinh viên");
                    for (int i = 0; i < currentIndex; i++) {
                        System.out.printf("%.0f\t", scores[i]);
                    }
                    System.out.printf("\n");
                    break;
                case 3:
                    if (currentIndex == 0) {
                        System.out.println("Chưa có điểm sinh viên, không có điểm trung bình");
                    }else{
                        float sumScore = 0;
                        for (int i = 0; i < currentIndex; i++) {
                            sumScore += scores[i];
                        }
                        float avgScore = sumScore / currentIndex;
                        System.out.println("Điểm trung bình của các sinh viên là:" + avgScore);
                    }
                    break;
                case 4:
                    float minScore = scores[0];
                    float maxScore = scores[1];
                    for (int i = 1; i < currentIndex; i++) {
                        if (scores[i] < minScore) {
                            minScore = scores[i];
                        }
                        if (scores[i] > maxScore) {
                            maxScore = scores[i];
                        }
                    }
                    System.out.printf("Giá trị lớn nhât :%.0f - Giá trị nhỏ nhất: %.0f\n", maxScore, minScore);
                    break;
                case 5:
                    int cntStudentFail = 0;
                    int cntStudentPass = 0;
                    for (int i = 0; i < currentIndex; i++) {
                        if(scores[i]<5){
                            cntStudentFail++;
                        }else{
                            cntStudentPass++;
                        }
                    }
                    System.out.printf("Số sinh viên đạt: %d - Số sinh viên trượt: %d\n", cntStudentPass,cntStudentFail);
                    break;
                case 6:
                    for (int i = 0; i < currentIndex - 1; i++) {
                        for(int j =i+1; j<currentIndex; j++){
                            if(scores[i]>scores[j]){
                                float temp = scores[i];
                                scores[i]=scores[j];
                                scores[j]=temp;
                            }
                        }
                    }
                    break;
                case 7:
                    int cntStudentGood = 0;
                    for (int i = 0; i < currentIndex; i++) {
                        if(scores[i]>+8){
                            cntStudentGood++;
                        }
                    }
                    System.out.printf("Có %d sinh viên đạt loại giỏi và xuất sắc\n",cntStudentGood);
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng chọn từ 1 đến 8");
                    break;

            }
        } while (true);
    }
}
