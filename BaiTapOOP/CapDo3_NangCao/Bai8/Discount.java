package BaiTapOOP.CapDo3_NangCao.Bai8;

public interface Discount {

    float apply_discount(Product product, float percentage);

    float apply_bulk_discount(Cart cart);
}
