package BaiTapOOP.CapDo3_NangCao.Bai6;

public class Clothing extends Product {
    private String size;
    private String material;

    //Constructor
    public Clothing(String name, long price, String category, int stock, String size, String material) {
        super(name, price, category, stock);
        this.size = size;
        this.material = material;
    }

    //Getter & Setter
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void thongTinSanPham(Product product) {
        super.thongTinSanPham(product);
        System.out.println("Kích cỡ: " + this.getSize());
        System.out.println("Chất liệu: " + this.getMaterial());
    }
}
