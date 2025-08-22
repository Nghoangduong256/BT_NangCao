package BaiTapOOP.CapDo1_DonGian.Bai3;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<CartItem> cart = new ArrayList<>();

    public void add_product(CartItem cartItem){
        this.cart.add(cartItem);
    };

    public void remove_product(CartItem cartItem){
        this.cart.remove(cartItem);
        System.out.println("Đã xóa sản phẩm: " + cartItem + " khỏi giỏ hàng");
    };

    public long get_total_price (){
        long totalPrice = 0;

        for (int i = 0; i < cart.size(); i++){
            totalPrice = cart.get(i).getProduct().getPrice() * cart.get(i).getQuantity();
        }

        return totalPrice;
    }

}
