package BaiTapOOP.CapDo1_DonGian.Bai1;

import static BaiTapOOP.CapDo1_DonGian.Bai1.Product.thongTinSanPham;

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

        thongTinSanPham(ps5);
        thongTinSanPham(laptopAcer);
    }


}
