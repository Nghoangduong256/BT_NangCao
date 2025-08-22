package BaiTapOOP.CapDo1_DonGian.Bai3;

public class Main {
    public static void main(String[] args) {
        Product ps5 = new Product();
        ps5.setName("PlayStation®5");
        ps5.setCategory("Video Games");
        ps5.setStock(15);
        ps5.setPrice(13300000);

        Product laptopAcer = new Product();
        laptopAcer.setName("Laptop Acer Gaming Aspire 7");
        laptopAcer.setCategory("Laptop");
        laptopAcer.setStock(5);
        laptopAcer.setPrice(18990000);

        Product manHinhPC = new Product();
        manHinhPC.setName("Màn hình E-Dra EGM24F100H 24 inch");
        manHinhPC.setCategory("Màn hình máy tính");
        manHinhPC.setStock(46);
        manHinhPC.setPrice(1590000);

        //Khởi tạo CartItem
        CartItem cartItem1 = new CartItem(ps5, 1);
        CartItem cartItem2 = new CartItem(laptopAcer, 2);
        CartItem cartItem3 = new CartItem(manHinhPC, 1);

        //Đưa hàng vào Cart
        Cart cart = new Cart();
        cart.add_product(cartItem1);
        cart.add_product(cartItem2);
        cart.add_product(cartItem3);


        //Xóa khỏi giỏ hàng
        cart.remove_product(cartItem2);
        System.out.println("Trạng thái giỏ hàng:");
        for (int i = 0; i < cart.cart.size(); i++){
            System.out.println(cart.cart.get(i).getProduct().getName() + ", số lượng: " + cart.cart.get(i).getQuantity());
        }

        //Tính tổng giá tiền
        System.out.println("Tổng giá tiền của giỏ hàng: " + cart.get_total_price() + "VND");
        ;

    }
}
