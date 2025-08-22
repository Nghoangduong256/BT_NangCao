package BaiTapOOP.CapDo1_DonGian.Bai4;

public class Order {
    private String orderId;
    private String user;
    private String[] products;
    private int totalPrice;
    private Status status;

    public Order(String orderId, String user, String[] products, int totalPrice, Status status) {
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

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
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

    public static void updateOrderStatus(Order[] orders, String orderId, Status status){
        Order updatedOrder = ;
        for (int i = 0; i < orders.length; i++){
            if (orders[i].getOrderId().equals(orderId)){
                orders[i].setStatus(status);
                updatedOrder.setOrderId(orders[i].getOrderId());
                updatedOrder.setProducts(orders[i].getProducts());
                updatedOrder.setUser(orders[i].getUser());
                updatedOrder.setTotalPrice(orders[i].getTotalPrice());
                updatedOrder.setStatus(orders[i].getStatus());
            }
        }

        System.out.println("Đơn hàng đã được cập nhật:");
        System.out.println("Mã vận đơn: "+ updatedOrder.getOrderId());
        System.out.println("Người dùng: "+ updatedOrder.getUser());
        System.out.println("Trạng thái: "+ updatedOrder.getStatus());
    }
}
