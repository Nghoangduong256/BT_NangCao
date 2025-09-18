package BaiTapOOP.ChuaBai.Bai9;

public class Main {
    public static void main(String[] args) {
        // Tạo kho
        Inventory inventory = new Inventory();

        // Tạo sản phẩm
        Product p1 = new Product("Chuột", 200, "Thiết bị", 10);
        Product p2 = new Product("Bàn phím", 500, "Thiết bị", 5);

        // Thêm vào kho
        inventory.addProduct(p1);
        inventory.addProduct(p2);

        // Kiểm tra tồn kho
        inventory.check_stock("Chuột");

        // Nhập thêm hàng
        inventory.restock("Chuột", 5);

        // Tạo đơn hàng
        Product[] orderItems = {p1, p2};
        Order order = new Order("DH001", "Nguyễn Văn A", orderItems, 800000, Status.DANG_XU_LY);

        // Xuất kho
        inventory.deduct_stock(order);

        // Kiểm tra tồn kho lại
        inventory.check_stock("Chuột");
        inventory.check_stock("Bàn phím");
    }
}
