package BaiTapOOP.CapDo3_NangCao.Bai6;

public class Electronics extends Product{
    private String brand;
    private String warranty;

    //Constructor
    public Electronics(String name, long price, String category, int stock, String brand, String warranty) {
        super(name, price, category, stock);
        this.brand = brand;
        this.warranty = warranty;
    }

    //Getter & Setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    @Override
    public void thongTinSanPham(Product product) {
        super.thongTinSanPham(product);
        System.out.println("Nhãn hiệu: " + this.getBrand());
        System.out.println("Bảo hành: " + this.getWarranty());
    }
}
