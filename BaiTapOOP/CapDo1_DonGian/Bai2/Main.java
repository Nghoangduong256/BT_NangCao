package BaiTapOOP.CapDo1_DonGian.Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Duong2015", "duong@gmail.com", "password@15");

        //Scanner
        Scanner scanner = new Scanner(System.in);

        //Giao diện đăng nhập
        System.out.println("Đăng nhập người dùng");
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("Gmail: ");
        String gmail = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();

        kiemTraDangNhap(user1, username, gmail, password);
    }

    public static void kiemTraDangNhap (User user, String username, String gmail, String password) {
        //Validate
        //Kiểm tra Username
        if (username.isEmpty() || !(user.getUsername().equals(username))){
            throw new RuntimeException("Username không đúng, vui lòng đăng nhập lại");
        } else {

        }

        //Kiểm tra Gmail
        if (gmail.isEmpty() || !(user.getEmail().contains("@gmail.com")) || !(user.getEmail().equals(gmail))){
            throw new RuntimeException("Gmail không đúng, vui lòng đăng nhập lại");
        }

        //Kiểm tra Password
        if (password.isEmpty() || !(user.getPassword().equals(password))){
            throw new RuntimeException("Password không đúng, vui lòng đăng nhập lại");
        }

        //Đăng nhập thành công
        System.out.println("Đăng nhập thành công!");
        System.out.println("Welcome " + user.getUsername());
    }
}
