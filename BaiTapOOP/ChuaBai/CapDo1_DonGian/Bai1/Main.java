package BaiTapOOP.ChuaBai.CapDo1_DonGian.Bai1;


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

        ps5.thongTinSanPham();
        laptopAcer.thongTinSanPham();
    }


}
