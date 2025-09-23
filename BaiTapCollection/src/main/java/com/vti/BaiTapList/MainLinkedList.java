package com.vti.BaiTapList;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList<Product> cart = new LinkedList<>();

        // Thêm sản phẩm vào giỏ
        addProduct(cart, new Product("Trụ đấm bốc boxing", 1900000, "Đấm bốc & Võ Tổng Hợp", 17));
        addProduct(cart, new Product("Xà kép Parallettes Dip Pocorrys", 1890000, "Thiết Bị Thể Thao", 301));
        addProduct(cart,new Product("PARAMIUM | Parallettes Tập Calisthenics", 364000, "Thiết Bị Thể Thao", 76));
        addProduct(cart, new Product("Tạ tay điều chỉnh Loại 1 Welike", 1150000, "Thiết Bị Thể Thao", 1));
        addProduct(cart, new Product("Áo Thun Calisthenics Chiến binh Samurai", 387000, "Áo Thun", 11));

        // In giỏ hàng
        System.out.println("== Giỏ hàng sau khi thêm ==");
        printCart(cart);

        // Xóa sản phẩm
        deleteProduct(cart, "Trụ đấm bốc boxing");
        System.out.println("== Giỏ hàng sau khi xóa ==");
        printCart(cart);

        // Lấy sản phẩm đầu tiên
        if (!cart.isEmpty()) {
            Product firstProduct = cart.getFirst();
            System.out.println("== Sản phẩm đầu tiên trong giỏ ==" + firstProduct);
        }

        // Lấy sản phẩm cuối cùng
        if (!cart.isEmpty()) {
            Product lastProduct = cart.getLast();
            System.out.println("== Sản phẩm cuối cùng trong giỏ ==" + lastProduct);
        }
    }

    // Methods
    public static void addProduct(LinkedList<Product> cart, Product product){
        cart.add(product);
    }

    public static void deleteProduct(LinkedList<Product> cart, String productName){
        Product foundProduct = null;
        for (Product product : cart){
            if (product.getName().equals(productName)) {
                foundProduct = product;
            }
        }

        if (foundProduct != null){
            cart.remove(foundProduct);
            System.out.println("Xóa thành công sản phẩm");
        } else {
            System.out.println("Không tìm thấy sản phẩm!");
        }
    }

    public static void printCart(LinkedList<Product> cart){
        for (Product product: cart){
            System.out.println(product);
        }
    }
}
