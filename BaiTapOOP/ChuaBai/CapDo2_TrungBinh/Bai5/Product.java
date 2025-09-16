package BaiTapOOP.ChuaBai.CapDo2_TrungBinh.Bai5;

public class Product {
    private String name;
    private long price;
    private String category;

    //Constructor
    public Product(String name, long price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
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
}
