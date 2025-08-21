package BaiTapOOP.CapDo1_DonGian.Bai1;

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

    public static void thongTinSanPham(Product product){
        System.out.println("Thông tin của sản phẩm");
        System.out.println("Tên sản phẩm: " + product.getName());
        System.out.println("Loại sản phẩm: " + product.getCategory());
        System.out.println("Tồn kho: " + product.getStock());
        System.out.println("Giá: " + product.getPrice());
    }
}
