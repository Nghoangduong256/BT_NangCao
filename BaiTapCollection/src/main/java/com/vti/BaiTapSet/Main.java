package com.vti.BaiTapSet;

import java.time.LocalDate;
import java.util.*;
import java.util.Set;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {

        // =============== PRODUCT ==============
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

        // Quản lý danh sách sản phẩm bằng Hashset
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

        // =============== PRODUCT.CATEGORY ==============
        //Dùng TreeSet<String> để lưu danh mục sản phẩm theo thứ tự bảng chữ cái.
        TreeSet<String> categories = new TreeSet<>();
        for (Product product : productList){
            categories.add(product.getCategory());
        }
        System.out.println("== Danh sách hạng mục sản phẩm ==");
        for (String str : categories){
            System.out.println(str);
        }

        // =============== USER ==============
        // Quản lý User bằng Hashset
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

        // =============== ORDER ==============
        LinkedHashSet<Order> deliveredOrders = new LinkedHashSet<>();

        // Bổ sung đơn hàng
        Order order1 = new Order(101, user1, product1, 1900000, Status.DELIVERED, LocalDate.now());
        Order order2 = new Order(102, user2, product2, 1890000, Status.PROCESSING, LocalDate.now());
        Order order3 = new Order(103, user3, product3, 728000, Status.DELIVERED, LocalDate.now());
        Order order4 = new Order(101, user1, product1, 1900000, Status.PROCESSING,  LocalDate.now());

        // Thêm vào deliveredOrders
        addOrder(deliveredOrders, order1);
        addOrder(deliveredOrders, order2);
        addOrder(deliveredOrders, order3);
        addOrder(deliveredOrders, order4);

        //In ra danh sách orders
        printDeliveredOrders(deliveredOrders);

        // =============== FAVORITE PRODUCT ==============
        Set<Product> favoriteProduct = new HashSet<>();
        favoriteProduct.add(product1);
        favoriteProduct.add(product4);
        favoriteProduct.add(product7);

        checkFavoriteProduct(favoriteProduct, product1);
        checkFavoriteProduct(favoriteProduct, product2);

    }
    // =============== Methods ==============
    // Hàm thêm user và check email trùng
    public static void addUser(HashSet<User> users, User user) {
        if (users.contains(user)) {
            System.out.println("Email '" + user.getEmail() + "' đã tồn tại. Không thể thêm " + user.getUsername());
        } else {
            users.add(user);
            System.out.println("Thêm thành công: " + user.getUsername());
        }
    }

    // Hàm thêm order vào danh sách order hoàn thành
    public static void addOrder(LinkedHashSet<Order> deliveredOrder, Order order){
        if (order.getStatus() == Status.DELIVERED){
            deliveredOrder.add(order);
        }
    }

    // Hàm in ra danh sách orders
    public static void printDeliveredOrders(LinkedHashSet<Order> deliveredOrder){
        System.out.println("Danh sách đơn hàng đã giao: ");
        for (Order order: deliveredOrder){
            System.out.println(order);
        }
    }

    // Hàm kiểm tra sản phẩm có trong danh sách yêu thích hay không
    public static void checkFavoriteProduct (Set<Product> favoriteProduct, Product product){
        if (favoriteProduct.contains(product)){
            System.out.println("Sản phẩm " + product.getName() + " có trong danh sách sản phẩm được yêu thích");
        } else {
            System.out.println("Sản phẩm " + product.getName() + " không có trong danh sách sản phẩm được yêu thích");
        }
    }
}

