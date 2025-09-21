package com.vti.BaiTapList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Quản lý danh sách sản phẩm bằng ArrayList
        ArrayList<Product> productList = new ArrayList<>();
        addProduct(productList, "Trụ đấm bốc boxing", 1900000, "Đấm bốc & Võ Tổng Hợp", 17);
        addProduct(productList, "Xà kép Parallettes Dip Pocorrys", 1890000, "Thiết Bị Thể Thao", 301);
        addProduct(productList,"PARAMIUM | Parallettes Tập Calisthenics", 364000, "Thiết Bị Thể Thao", 76);
        addProduct(productList, "Tạ tay điều chỉnh Loại 1 Welike", 1150000, "Thiết Bị Thể Thao", 1);
        addProduct(productList, "Áo Thun Calisthenics Chiến binh Samurai", 387000, "Áo Thun", 11);

        printProduct(productList);

        deleteProduct(productList, "Xà kép Parallettes Dip Pocorrys");

        printProduct(productList);

        findMaxPrice(productList);

        filterProductByCategory(productList, "Thiết Bị Thể Thao");

        sortToMaxPrice(productList);
    }

    public static void addProduct(ArrayList<Product> productList, String name, int price, String category, int stock){
        Product product = new Product(null, 0 , null, 0);
        product.setName(name);
        product.setCategory(category);
        product.setPrice(price);
        product.setStock(stock);
        productList.add(product);
    }

    public static void deleteProduct(ArrayList<Product> productList, String productName){
        Product foundProduct = null;
        for (Product product : productList){
            if (product.getName().equals(productName)) {
                foundProduct = product;
            }
        }

        if (foundProduct != null){
            productList.remove(foundProduct);
            System.out.println("Xóa thành công sản phẩm");
        } else {
            System.out.println("Không tìm thấy sản phẩm!");
        }
    }

    public static void printProduct(ArrayList<Product> productList){
        for (Product product: productList){
            System.out.println(product);
        }
    }

    // 2. Tìm sản phẩm có giá cao nhất trong danh sách
    public static void findMaxPrice (ArrayList<Product> productList) {
        Product maxPriceProduct = null;
        int maxPrice = 0;
        for (int i = 0; i < productList.size(); i++){
            if (productList.get(i).getPrice() > maxPrice) {
                maxPrice = productList.get(i).getPrice();
                 maxPriceProduct = productList.get(i);
            }
        }

        if (maxPriceProduct != null){
            System.out.println("Sản phẩm đắt tiến nhất: " + maxPriceProduct);
        } else {
            System.out.println("Không tìm thấy sản phẩm!");
        }
    }

    //3. Lọc sản phẩm theo danh mục
    public static void filterProductByCategory (ArrayList<Product> productList, String category){
        ArrayList<Product> filterProduct = new ArrayList<>();
        for (Product product : productList){
            if (product.getCategory().equals(category)) {
                filterProduct.add(product);
            }
        }

        if (filterProduct.size() == 0){
            System.out.println("Không tìm thấy sản phẩm!");
        } else {
            System.out.println("List sản phẩm " + category + ":");
            for (Product product : filterProduct){
                System.out.println(product);
            }

        }
    }

    // 4. Sắp xếp danh sách sản phẩm theo giá tăng dần
    public static void sortToMaxPrice (ArrayList<Product> productList) {
        productList.sort(Comparator.comparingInt(Product::getPrice));

        System.out.println("Danh sách sản phẩm sau khi sắp xếp theo giá tăng dần");
        for (Product product : productList){
            System.out.println(product);
        }
    }
}

