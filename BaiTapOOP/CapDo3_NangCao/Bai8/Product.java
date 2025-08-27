package BaiTapOOP.CapDo3_NangCao.Bai8;

public class Product {
    private String name;
    private int price;
    private String category;
    private int stock;
    private float discountPercentage;

    //Constructor
    public Product(String name, int price, String category, int stock, float discountPercentage) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
        this.discountPercentage = discountPercentage;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
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

    public float getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(float discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
