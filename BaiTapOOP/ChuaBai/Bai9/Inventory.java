package BaiTapOOP.ChuaBai.Bai9;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Product> productMap = new HashMap<>();

    public void addProduct(Product product){
        productMap.put(product.getName(), product);
    }

    public int check_stock(String productName){
        Product product = productMap.get(productName);
        if (product != null && product.getStock() > 0){
            System.out.println("Số lượng còn lại: " + product.getStock());
            return product.getStock();
        } else {
            System.out.println("Sản phẩm đã hết hàng hoặc không tồn tại");
            return 0;
        }
    }

    public void restock(String productName, int quantity){
        if (quantity <= 0){
            System.out.println("Vui lòng nhập số lượng hợp lệ");
            return;
        }
        Product product = productMap.get(productName);
        if (product != null){
            product.setStock(product.getStock() + quantity);
            System.out.println("Đã nhập thêm " + quantity + " cho sản phẩm " + productName);
        } else {
            System.out.println("Sản phẩm không tồn tại trong kho");
        }
    }

    public void deduct_stock(Order order){
        for (Product p : order.getProducts()){
            Product inStock = productMap.get(p.getName());
            if (inStock != null && inStock.getStock() > 0){
                inStock.setStock(inStock.getStock() - 1);
            } else {
                System.out.println("Sản phẩm " + p.getName() + " đã hết hàng");
            }
        }

        System.out.println("Xác nhận đơn hàng: ");
        System.out.println("Mã đơn hàng: " + order.getOrderId());
        System.out.println("Người dùng: " + order.getUser());
        System.out.println("Sản phẩm:");
        for (Product p : order.getProducts()){
            System.out.println("- " + p.getName());
        }
    }
}
