package BaiTapOOP.CapDo3_NangCao.Bai6;

public class Product {
    private String name;
    private long price;
    private String category;
    private int stock;

    //Constructor
    public Product(String name, long price, String category, int stock) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public  void thongTinSanPham(Product product){
        System.out.println("Thông tin của sản phẩm");
        System.out.println("Tên sản phẩm: " + product.getName());
        System.out.println("Loại sản phẩm: " + product.getCategory());
        System.out.println("Tồn kho: " + product.getStock());
        System.out.println("Giá: " + product.getPrice());
    }
}
