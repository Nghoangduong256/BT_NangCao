package BaiTapOOP.ChuaBai.CapDo3_NangCao.Bai8;

public interface  Discount {

     float apply_discount(Product product, float percentage);

     int apply_bulk_discount(Cart cart);
}
