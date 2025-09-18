package BaiTapOOP.ChuaBai.CapDo3_NangCao.Bai8;

public class Main {
    public static void main(String[] args) {
        Product ps5 = new Product("PlayStation®5", 13300000, "Video Games Consoles", 15, 0.1f);
        Product laptopAcer = new Product("Laptop Acer Gaming Aspire 7", 18990000, "Laptop", 5, 0.15f);
        Product manHinhPC = new Product("Màn hình E-Dra EGM24F100H 24 inch", 1590000, "Màn hình máy tính", 46, 0.25f);

        //Khởi tạo cart
        Cart cart = new Cart();
        cart.add_product(new CartItem(ps5, 1));
        cart.add_product(new CartItem(laptopAcer, 1));
        cart.add_product(new CartItem(manHinhPC, 1));


        // Đếm tổng số lượng sản phẩm
        int items = 0;
        for (CartItem item : cart.getCartItems()) {
            items += item.getQuantity();
        }

        // Demo tính tổng tiền
        System.out.println("========== TIẾN HÀNH THANH TOÁN ==========");
        if (items <= 3) {
            System.out.println("Áp dụng giảm giá từng sản phẩm!");
        } else {
            System.out.println("Áp dụng giảm giá theo tổng giá trị giỏ hàng!");
        }

        int total = cart.get_total_price(items);
        System.out.println("Tổng tiền phải thanh toán: " + total + " VND");

    }
}
