package baitap03;

public class User {
    private String name;
    private String email;
    private String phoneNumber;

    public User(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Tên: " + name + ", Email: " + email + ", Số điện thoại: " + phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
