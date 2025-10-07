package com.vti.BaiTapMap;

import com.vti.BaiTapMap.Product;
import com.vti.BaiTapMap.Order;
import com.vti.BaiTapMap.Status;
import com.vti.BaiTapMap.User;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // =============== PRODUCT ==============
        List<Product> productList = new ArrayList<>();
        Product product1 = new Product("P001", "Trụ đấm bốc boxing", 1900000, "Đấm bốc & Võ Tổng Hợp", 17);
        Product product2 = new Product("P002","Xà kép Parallettes Dip Pocorrys", 1890000, "Thiết Bị Thể Thao", 301);
        Product product3 = new Product("P003","PARAMIUM | Parallettes Tập Calisthenics", 364000, "Thiết Bị Thể Thao", 76);
        Product product4 = new Product("P004","Tạ tay điều chỉnh Loại 1 Welike", 1150000, "Thiết Bị Thể Thao", 1);
        Product product5 = new Product("P005","Áo Thun Calisthenics Chiến binh Samurai", 387000, "Áo Thun", 11);
        Product product6 = new Product("P006","Tạ tay điều chỉnh Loại 1 Welike", 1150000, "Thiết Bị Thể Thao", 1);
        Product product7 = new Product("P007","Xà kép Parallettes Dip Pocorrys", 1890000, "Thiết Bị Thể Thao", 301);
        Product product8  = new Product("P008","Giày chạy bộ Adidas Ultraboost", 3200000, "Chạy bộ", 40);
        Product product9  = new Product("P009","Bóng đá UHV 2.07", 790000, "Bóng đá", 65);
        Product product10 = new Product("P010","Găng tay thủ môn Nike Grip3", 1150000, "Bóng đá", 25);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        productList.add(product7);
        productList.add(product8);
        productList.add(product9);
        productList.add(product10);

        // =============== USER ==============
        // Quản lý User bằng Hashset
        User user1 = new User("dangblack", "dang@gmail.com", "$2a$10$W2neF9");
        User user2 = new User("quanganh", "anh@gmail.com", "6Agi6kAKVq");
        User user3 = new User("vanchien", "chien@gmail.com", "8q3fec5dHW8KUA");
        User user4 = new User("DuongClone", "dang@gmail.com", "pop123");

        HashSet<User> userList = new HashSet<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

//        System.out.println("\n== Danh sách khách hàng ==");
//        for (User u : userList) {
//            System.out.println(u);
//        }

        // =============== ORDER ==============
        LinkedHashSet<Order> deliveredOrders = new LinkedHashSet<>();

        // Bổ sung đơn hàng
        Order order1 = new Order(101, user1, product1, 1900000, Status.DELIVERED, LocalDate.now());
        Order order2 = new Order(102, user2, product2, 1890000, Status.PROCESSING, LocalDate.now());
        Order order3 = new Order(103, user3, product3, 728000, Status.DELIVERED, LocalDate.now());
        Order order4 = new Order(104, user1, product6, 1900000, Status.PROCESSING,  LocalDate.now());
        Order order5 = new Order(105, user3, product6, 3800000, Status.CANCELED,  LocalDate.now());

        // Thêm vào deliveredOrders
        deliveredOrders.add(order1);
        deliveredOrders.add(order2);
        deliveredOrders.add(order3);
        deliveredOrders.add(order4);
        deliveredOrders.add(order5);

//        //In ra danh sách orders
//        printDeliveredOrders(deliveredOrders);

        // =============== REVIEW ==============
        List<Review> reviewList = new ArrayList<>();
        Review review1 = new Review(user1, product3, 5, "Paralettes chắc chắn, mẫu mã đẹp", LocalDate.now());
        Review review2 = new Review(user1, product6, 5, "Quá xuất xắc, mua 1 bộ tập suốt đời", LocalDate.now());
        Review review3 = new Review(user2, product2, 4, "Xà tốt nhưng ốc dễ lỏng quá, khó vặn", LocalDate.now());
        Review review4 = new Review(user2, product5, 4, "Áo rất ngầu, mỗi tội hơi dễ chảy", LocalDate.now());
        Review review5 = new Review(user3, product9, 2, "Bóng dễ thủng, chất liệu kém", LocalDate.now());
        Review review6 = new Review(user4, product8, 5, "Chạy như Usian Bolt", LocalDate.now() );

        reviewList.add(review1);
        reviewList.add(review2);
        reviewList.add(review3);
        reviewList.add(review4);
        reviewList.add(review5);
        reviewList.add(review6);

        // =============== HASHMAP QUẢN LÝ STOCK ==============
        HashMap<String, Integer> productMap = new HashMap<>();

        for (Product product : productList) {
            String id = product.getProductId();
            int stock = product.getStock();

            productMap.put(id, stock);
        }

        // =============== HASHMAP QUẢN LÝ ORDER ==============
        HashMap<String, Integer> ordersMap = new HashMap<>();
        for (Order order : deliveredOrders){
            String username = order.getUser().getUsername();

            if (ordersMap.containsKey(username)){
                ordersMap.put(username, ordersMap.get(username) + 1);
            } else {
                ordersMap.put(username, 1);
            }
        }

        // =============== HASHMAP QUẢN LÝ REVIEW ==============
        HashMap<User, List<Review>> reviewMap = new HashMap<>();


        // =============== HIỂN THỊ DANH SÁCH SẢN PHẨM ==============
        System.out.println("Danh sách sản phẩm: ");
        System.out.println("Số lượng: " + productMap.size());
        for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
            System.out.println("Mã sản phẩm: " + entry.getKey() + " | Tổng tồn kho: " + entry.getValue());
        }

        // =============== HIỂN THỊ DANH SÁCH SỐ LẦN MUA HÀNG ==============
        System.out.println("Danh sách mua hàng của khách hàng: ");
        for (Map.Entry<String, Integer> entry : ordersMap.entrySet()) {
            System.out.println("Tên khách hàng: " + entry.getKey() + "| Tổng đơn hàng: " + entry.getValue());
        }
    }


}
