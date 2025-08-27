package BaiTapOOP.CapDo3_NangCao.Bai8;

public class Main {
    public static void main(String[] args) {
        Product ps5 = new Product("PlayStation®5", 13300000, "Video Games Consoles", 15, 0.1f);
        Product laptopAcer = new Product("Laptop Acer Gaming Aspire 7", 18990000, "Laptop", 5, 0.15f);
        Product manHinhPC = new Product("Màn hình E-Dra EGM24F100H 24 inch", 1590000, "Màn hình máy tính", 46, 0.25f);

        //Khởi tạo CartItem
        CartItem cartItem1 = new CartItem(ps5, 1);
        CartItem cartItem2 = new CartItem(laptopAcer, 2);
        CartItem cartItem3 = new CartItem(manHinhPC, 1);

        //Đưa hàng vào Cart
        Cart cart = new Cart();
        cart.add_product(cartItem1);
        cart.add_product(cartItem2);
        cart.add_product(cartItem3);

        //Tính tổng giá tiền
        System.out.println("Tổng giá tiền trước giảm giá: " + cart.get_total_price() + "VND");
        System.out.println("Áp dụng giảm giá 1) (Theo sản phẩm): ");
        System.out.println("");

    }
}
