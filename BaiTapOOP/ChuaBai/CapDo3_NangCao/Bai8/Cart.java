package BaiTapOOP.ChuaBai.CapDo3_NangCao.Bai8;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> cart = new ArrayList<>();
    private Discount discount = new DiscountCalculator();

    public void add_product(CartItem item) {
        cart.add(item);
    }

    public List<CartItem> getCartItems() {
        return cart;
    }

    public int get_total_price(int items) {
        int total = 0;
        if (items <= 3) {
            for (CartItem ci : cart) {
                total += (ci.getProduct().getPrice() * ci.getQuantity())
                        - (discount.apply_discount(ci.getProduct(), ci.getProduct().getDiscountPercentage()) * ci.getQuantity());
            }
        } else {
            int subtotal = 0;
            for (CartItem ci : cart) {
                subtotal += ci.getProduct().getPrice() * ci.getQuantity();
            }
            total = subtotal - discount.apply_bulk_discount(this); // truyền chính this
        }
        return total;
    }
}
