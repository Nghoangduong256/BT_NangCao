package BaiTapOOP.CapDo3_NangCao.Bai8;

import java.util.List;

public abstract class Discount {

    abstract float apply_discount(Product product, float percentage);

    abstract int apply_bulk_discount(List<CartItem> cart);
}
