package BaiTapOOP.ChuaBai.CapDo2_TrungBinh.Bai5;

import java.time.LocalDate;

public class Review {
    private User user;
    private Product product;
    private int rating;
    private String comment;
    private LocalDate createdAt;

    // Constructor
    public Review(User user, Product product, int rating, String comment, LocalDate createdAt) {
        this.user = user;
        this.product = product;
        this.rating = rating;
        this.comment = comment;
        this.createdAt = createdAt;
    }

    // Getter & Setter
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Rating phải từ 1 đến 5");
        }
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public void displayReview() {
        System.out.println("----- REVIEW -----");
        System.out.println("Người dùng: " + user.getUsername() + " (" + user.getEmail() + ")");
        System.out.println("Sản phẩm: " + product.getName() + " - " + product.getPrice() + " VND");
        System.out.println("Đánh giá: " + rating + "/5");
        System.out.println("Bình luận: " + comment);
        System.out.println("Thời gian: " + createdAt);
    }
}
