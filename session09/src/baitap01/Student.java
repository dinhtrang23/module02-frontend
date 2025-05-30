package baitap01;

import java.util.Scanner;

public class Student {
    private String studentId;
    private String studentName;
    private int age;
    private String major;
    public Student(){

    }

    public Student(String studentId, String studentName, int age, String major) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.major = major;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào mã sinh viên:");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên:");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào tuổi sinh viên");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào chuyên ngành sinh viên");
        this.major = scanner.nextLine();

    }

    public void displayData(){
        System.out.printf("Mã SV: %s - Tên SV: %s - Tuổi: %d - Chuyên nghành: %s\n",
                this.studentId, this.studentName, this.age, this.major);
    }
}
