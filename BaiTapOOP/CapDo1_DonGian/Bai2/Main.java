package BaiTapOOP.CapDo1_DonGian.Bai2;

import java.util.Scanner;

import static BaiTapOOP.CapDo1_DonGian.Bai2.User.kiemTraDangNhap;

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


}
