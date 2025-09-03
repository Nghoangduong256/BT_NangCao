package BaiTapOOP.CapDo3_NangCao.Bai8;

import java.util.ArrayList;
import java.util.List;

public class Cart extends Discount {
    List<CartItem> cart = new ArrayList<>();

    //Methods
    public void add_product(CartItem cartItem) {
        this.cart.add(cartItem);
        System.out.println("==============");
        System.out.println("Đã thêm sản phẩm: " + cartItem.getProduct().getName());
    }

    ;

    public void remove_product(CartItem cartItem) {
        this.cart.remove(cartItem);
        System.out.println("==============");
        System.out.println("Đã xóa sản phẩm: " + cartItem.getProduct().getName() + " khỏi giỏ hàng");
    }

    ;

    public int get_total_price(int items) {
        int totalPrice = 0;
        if (items <= 3){
            for (int i = 0; i < this.cart.size(); i++){
                totalPrice += (int) ((this.cart.get(i).getProduct().getPrice() * this.cart.get(i).getQuantity())
                                        - (apply_discount(this.cart.get(i).getProduct(), this.cart.get(i).getProduct().getDiscountPercentage()) * this.cart.get(i).getQuantity()));
            }
        } else {
            float subtotal = 0f;
            for (int i = 0; i < this.cart.size(); i++){
                subtotal += (float) this.cart.get(i).getProduct().getPrice()
                        * this.cart.get(i).getQuantity();
            }
            totalPrice = (int) (subtotal - apply_bulk_discount(cart));
        }
        return totalPrice;
    }


    public float apply_discount(Product product, float percentage) {
        float discount = product.getPrice() * percentage;
        return discount;
    }

    public int apply_bulk_discount(List<CartItem> cart) {
        int discount = 0;
        int priceBeforeBulk = 0;
        for (int i = 0; i < cart.size(); i++){
            priceBeforeBulk +=  cart.get(i).getProduct().getPrice() * cart.get(i).getQuantity();
        }

        if (priceBeforeBulk >= 5000000 && priceBeforeBulk <= 10000000) {
            System.out.println("Giảm giá 20% cho đơn hàng!");
            discount = (int) (priceBeforeBulk * 0.2f);
        } else if (priceBeforeBulk > 10000000 && priceBeforeBulk <= 15000000) {
            System.out.println("Giảm giá 40% cho đơn hàng!");
            discount = (int) (priceBeforeBulk * 0.4f);
        } else if (priceBeforeBulk > 15000000) {
            System.out.println("Giảm giá 60% cho đơn hàng!");
            discount = (int) (priceBeforeBulk * 0.6f);
        } else {
            discount = 0;
        }
        return discount;
    }
}
