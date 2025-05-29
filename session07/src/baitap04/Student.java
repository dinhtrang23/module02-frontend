package baitap04;

public class Student {
    private String name;
    private int age;
    private String className;
    private double avgScore;

    public Student(String name, int age, String className, double avgScore) {
        this.avgScore = avgScore;
        this.className = className;
        this.age = age;
        this.name = name;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tên: " + name + ", Tuổi: " + age + ", Lớp: " + className + ", Điểm trung bình: " + avgScore;
    }
}
