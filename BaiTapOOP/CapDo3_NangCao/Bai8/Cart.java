package BaiTapOOP.CapDo3_NangCao.Bai8;

import java.util.ArrayList;
import java.util.List;

public class Cart implements Discount{
    List<CartItem> cart = new ArrayList<>();

    //Methods
    public void add_product(CartItem cartItem){
        this.cart.add(cartItem);
        System.out.println("==============");
        System.out.println("Đã thêm sản phẩm: " + cartItem.getProduct().getName());
    };

    public void remove_product(CartItem cartItem){
        this.cart.remove(cartItem);
        System.out.println("==============");
        System.out.println("Đã xóa sản phẩm: " + cartItem.getProduct().getName() + " khỏi giỏ hàng");
    };

    public long get_total_price (){
        int totalPrice = 0;

        for (int i = 0; i < cart.size(); i++){
            totalPrice += cart.get(i).getProduct().getPrice() * cart.get(i).getQuantity();
        }

        return totalPrice;
    }

    public float price_after_discount (int total_price, float discount){
        float priceAfterDiscount = total_price - discount;
        return priceAfterDiscount;
    }

    @Override
    public float apply_discount(Product product, float percentage) {
        float discount = product.getPrice() * percentage;
        return discount;
    }

    @Override
    public float apply_bulk_discount(Cart cart) {
        float discount = 0f;
        if (cart.get_total_price() >= 5000000){
            discount = cart.get_total_price() * 0.2f;
        } else if (cart.get_total_price() >= 10000000) {
            discount = cart.get_total_price() * 0.4f;
        } else if (cart.get_total_price() >= 15000000) {
            discount = cart.get_total_price() * 0.6f;
        } else {
            discount = 0f;
        }
        return discount;
    }
}
