package BaiTapOOP.CapDo4_Kho.Bai9;

public class Order {
    private String orderId;
    private String user;
    private Product[] products;
    private int totalPrice;
    private Status status;

    public Order(String orderId, String user, Product[] products, int totalPrice, Status status) {
        this.orderId = orderId;
        this.user = user;
        this.products = products;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    // Method
    public void updateOrderStatus(Status status){
        this.status = status;
        System.out.println("Đơn hàng đã được cập nhật:");
        System.out.println("Mã vận đơn: "+ this.getOrderId());
        System.out.println("Người dùng: "+ this.getUser());
        System.out.println("Trạng thái: "+ this.getStatus());
    }

    public int getTotalPrice(Product[] products){
        for (int i = 0; i < products.length; i++){
            this.totalPrice += this.products[i].getPrice();
        }
        return this.totalPrice;
    }
}
