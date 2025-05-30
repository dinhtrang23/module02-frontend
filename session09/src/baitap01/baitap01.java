package baitap01;

import java.util.Scanner;

public class baitap01 {
    public static Student[] arrStudents = new Student[100];
    public static int currentIndex = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("********QUẢN LÝ SINH VIÊN***********");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Cập nhật sinh viên theo mã");
            System.out.println("4. Xóa sinh viên theo mã");
            System.out.println("5. Tìm kiếm sinh viên theo tên");
            System.out.println("6. Thoát");
            System.out.println("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayListStudent();
                    break;
                    case 2:
                        addStudent(scanner);
                        break;
                        case 3:
                            updateStudent(scanner);
                            break;
                            case 4:
                                deleteStudent(scanner);
                                break;
                                case 5:
                                    searchStudentByName(scanner);
                                    break;
                                    case 6:
                                        System.exit(0);
                default:
                    System.err.println("Vui lòng chọn từ 1-6");
            }

        }while (true);
    }
    public static  void displayListStudent(){
        if (currentIndex==0){
            System.out.println("Chưa có sinh viên");
            return;
        }
            System.out.println("THÔNG TIN CÁC SINH VIÊN");
            for(int i = 0; i < currentIndex;i++){
                arrStudents[i].displayData();

        }
    }

    public static void addStudent(Scanner scanner){
        System.out.println("Nhập vào số lượng sinh viên cần nhập thông tin");
        int cntStudent = Integer.parseInt(scanner.nextLine());
        for (int i=0;i < cntStudent;i++){
            arrStudents[currentIndex] = new Student();
            arrStudents[currentIndex].inputData(scanner);
            currentIndex++;
        }
    }

    public static int getIndexByStudentId(String studentId){
        for(int i = 0;i<currentIndex;i++){
            if(arrStudents[i].getStudentId().equals(studentId)){
                return i;
            }
        }
        return -1;
    }


    public static  void updateStudent(Scanner scanner){
        System.out.println("Nhập vào mã sinh viên cần cập nhật thông tin");
        String studentId = scanner.nextLine();
        int indexUpdate = getIndexByStudentId(studentId);
        if (indexUpdate == -1){
            System.out.println("Không tồn tại mã sinh viên");
            return;
        }

        boolean isExit = true;
        do{
            System.out.println("1. Cập nhật tên sinh viên");
            System.out.println("2. Cập nhật tuổi sinh viên");
            System.out.println("3. Cập nhật chuyên nghành");
            System.out.println("4. Thoát");
            System.out.println("Lựa chọn của bạn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập vào tên mới của sinh viên");
                    arrStudents[indexUpdate].setStudentName(scanner.nextLine());
                    break;
                    case 2:
                        System.out.println("Nhập vào tuổi mới của sinh viên");
                        arrStudents[indexUpdate].setAge(Integer.parseInt(scanner.nextLine()));
                        break;
                        case 3:
                            System.out.println("Nhập vào chuyên nghành mới của sinh viên");
                            arrStudents[indexUpdate].setMajor(scanner.nextLine());
                            break;
                            case 4:
                                isExit = false;
                                break;
                                default:
                                    System.err.println("Vui lòng nhập từ 1-4");
            }

        }while (isExit);
    }

    public  static void deleteStudent(Scanner scanner){
        System.out.println("Nhập vào mã sinh viên cần xóa");
        String studentId = scanner.nextLine();
        int indexDelete = getIndexByStudentId(studentId);
        if (indexDelete == -1){
            System.out.println("Mã sinh viên không tồn tại");
            return;
        }
        for (int i = indexDelete; i < currentIndex;i++){
            arrStudents[i] = arrStudents[i +1];
        }
        currentIndex--;
    }

    public static void searchStudentByName(Scanner scanner){
        int cntStudent = 0;
        System.out.println("Nhập vào tên sinh viên cần tìm");
        String studentName = scanner.nextLine();
        for (int i =0 ; i< currentIndex;i++){
            if(arrStudents[i].getStudentName().toLowerCase().contains(studentName.toLowerCase())){
                arrStudents[i].displayData();
                cntStudent++;
            }
        }
        System.out.printf("Tìm thấy %d sinh viên có tên chưa chuỗi %s\n", cntStudent, studentName);
    }
}
