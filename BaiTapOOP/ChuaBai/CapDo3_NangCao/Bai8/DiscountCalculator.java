package BaiTapOOP.ChuaBai.CapDo3_NangCao.Bai8;

public class DiscountCalculator implements Discount {

    @Override
    public float apply_discount(Product product, float percentage) {
        return product.getPrice() * percentage;
    }

    @Override
    public int apply_bulk_discount(Cart cart) {
        int total = 0;
        for (CartItem item : cart.getCartItems()) {
            total += item.getProduct().getPrice() * item.getQuantity();
        }

        if (total >= 5000000 && total <= 10000000) {
            System.out.println("Giảm giá 20% cho đơn hàng!");
            return (int) (total * 0.2);
        } else if (total > 10000000 && total <= 15000000) {
            System.out.println("Giảm giá 40% cho đơn hàng!");
            return (int) (total * 0.4);
        } else if (total > 15000000) {
            System.out.println("Giảm giá 60% cho đơn hàng!");
            return (int) (total * 0.6);
        }
        return 0;
    }
}
