package BaiTapOOP.ChuaBai.CapDo2_TrungBinh.Bai4;


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

    public void updateOrderStatus(String status){
        try {
            // Chuyển chuỗi thành enum (không phân biệt hoa thường)
            Status statusEnum = Status.valueOf(status.toUpperCase());
            this.status = statusEnum;
            System.out.println("Đơn hàng đã được cập nhật: " + statusEnum);
        } catch (IllegalArgumentException exception) {
            System.out.println("Trạng thái '" + status + "' không hợp lệ! "
                    + "Các giá trị hợp lệ là: PROCESSING, DELIVERED, CANCELED");
        }
    }
}
