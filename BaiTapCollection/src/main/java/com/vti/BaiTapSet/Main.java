package com.vti.BaiTapSet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Trụ đấm bốc boxing", 1900000, "Đấm bốc & Võ Tổng Hợp", 17);
        Product product2 = new Product("Xà kép Parallettes Dip Pocorrys", 1890000, "Thiết Bị Thể Thao", 301);
        Product product3 = new Product("PARAMIUM | Parallettes Tập Calisthenics", 364000, "Thiết Bị Thể Thao", 76);
        Product product4 = new Product("Tạ tay điều chỉnh Loại 1 Welike", 1150000, "Thiết Bị Thể Thao", 1);
        Product product5 = new Product("Áo Thun Calisthenics Chiến binh Samurai", 387000, "Áo Thun", 11);
        Product product6 = new Product("Tạ tay điều chỉnh Loại 1 Welike", 1150000, "Thiết Bị Thể Thao", 1);
        Product product7 = new Product("Xà kép Parallettes Dip Pocorrys", 1890000, "Thiết Bị Thể Thao", 301);
        Product p8  = new Product("Giày chạy bộ Adidas Ultraboost", 3200000, "Chạy bộ", 40);
        Product p9  = new Product("Bóng đá UHV 2.07", 790000, "Bóng đá", 65);
        Product p10 = new Product("Găng tay thủ môn Nike Grip3", 1150000, "Bóng đá", 25);



        /* 1. Quản lý danh sách sản phẩm bằng ArrayList */
        HashSet<Product> productList = new HashSet<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        productList.add(product7);
        productList.add(p8);
        productList.add(p9);
        productList.add(p10);

        // HashSet để check trùng
        HashSet<String> seen = new HashSet<>();
        int duplicateCount = 0;
        for (Product product : productList) {
            if (!seen.add(product.getName())) {
                // nếu add() trả về false nghĩa là đã tồn tại
                duplicateCount++;
                System.out.println("Sản phẩm trùng: " + product.getName());
            }
        }
        System.out.println("Tổng số sản phẩm trùng: " + duplicateCount);

        //Dùng TreeSet<String> để lưu danh mục sản phẩm theo thứ tự bảng chữ cái.
        TreeSet<String> categories = new TreeSet<>();
        for (Product product : productList){
            categories.add(product.getCategory());
        }
        System.out.println("== Danh sách hạng mục sản phẩm ==");
        for (String str : categories){
            System.out.println(str);
        }

        /* 7. Lưu danh sách khách hàng duy nhất */
        User user1 = new User("dangblack", "dang@gmail.com", "$2a$10$W2neF9");
        User user2 = new User("quanganh", "anh@gmail.com", "6Agi6kAKVq");
        User user3 = new User("vanchien", "chien@gmail.com", "8q3fec5dHW8KUA");
        User user4 = new User("DuongClone", "dang@gmail.com", "pop123");

        HashSet<User> userList = new HashSet<>();
        addUser(userList, user1);
        addUser(userList, user2);
        addUser(userList, user3);
        addUser(userList, user4);

        System.out.println("\n== Danh sách khách hàng ==");
        for (User u : userList) {
            System.out.println(u);
        }
    }

    // Hàm thêm user và check email trùng
    public static void addUser(HashSet<User> users, User user) {
        if (users.contains(user)) {
            System.out.println("Email '" + user.getEmail() + "' đã tồn tại. Không thể thêm " + user.getUsername());
        } else {
            users.add(user);
            System.out.println("Thêm thành công: " + user.getUsername());
        }
    }
}

