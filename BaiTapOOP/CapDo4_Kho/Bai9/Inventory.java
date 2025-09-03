package BaiTapOOP.CapDo4_Kho.Bai9;

import java.util.List;
import java.util.Map;

public class Inventory {
    private List<Product> productList;

    // Getter & Setter
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    //Constructor
    public Inventory(List<Product> productList) {
        this.productList = productList;
    }

    // Methods
    public int check_stock (Product product) {
        if (product.getStock() != 0){
            System.out.println("Số lượng");
            return product.getStock();
        } else {
            System.out.println("Sản phẩm đã hết hàng");
        }
        return 0;
    }

    public void restock (Product product, int quantity) {
        if (quantity <= 0){
            System.out.println("Vui lòng nhập số lượng hàng hóa");
        }

        for (int i = 0; i < this.productList.size(); i++){
            if (this.productList.get(i).getName().equals(product.getName())){
                this.productList.get(i).setStock(this.productList.get(i).getStock() + quantity)  ;
            } else {

            }
        }
    }

    public void deduct_stock(Order order) {
        for (int i = 0; i < order.getProducts().length; i++){
            Product orderProduct = order.getProducts()[i];
            if (orderProduct.getStock() !=0){
                orderProduct.setStock(orderProduct.getStock() - 1);
            } else {

            }

            System.out.println("Xác nhận đơn hàng: ");
            System.out.println("Mã đơn hàng: " + order.getOrderId());
            System.out.println("Người dùng: " + order.getUser());
            System.out.println("Sản phẩm: ");
            for (Product product : order.getProducts()){
                System.out.println(product.getName());
            }
            System.out.println();

        }
    }
}
