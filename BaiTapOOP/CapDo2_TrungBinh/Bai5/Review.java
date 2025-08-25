package BaiTapOOP.CapDo2_TrungBinh.Bai5;

import java.time.LocalDate;
import java.util.Scanner;

public class Review {
    private User user;
    private Product product;
    private int rating;
    private String comment;
    private LocalDate createdAt;

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

    public static void displayReview(Review[] reviewList){
        System.out.println("Chọn sản phẩm bạn muốn xem review:");
        System.out.println("1. Minecraft: Java & Bedrock");
        System.out.println("2. Call of Duty®");
        System.out.println("3. The Elder Scrolls V: Skyrim Special Edition (PC)");

        Scanner scanner = new Scanner(System.in);
        int productIndex = scanner.nextInt();

        switch (productIndex) {
            case 1 :
                for (int i = 0; i < reviewList.length; i++){
                    if (reviewList[i].getProduct().getName().equals("Minecraft: Java & Bedrock")){
                        System.out.println("Review: ");
                        System.out.println(reviewList[i].getComment());
                    }
                }
                break;
            case 2:
                for (int i = 0; i < reviewList.length; i++){
                    if (reviewList[i].getProduct().getName().equals("Call of Duty®")){
                        System.out.println("Review: ");
                        System.out.println(reviewList[i].getComment());
                    }
                }
                break;
            case 3:
                for (int i = 0; i < reviewList.length; i++){
                    if (reviewList[i].getProduct().getName().equals("The Elder Scrolls V: Skyrim Special Edition (PC)")){
                        System.out.println("Review: ");
                        System.out.println(reviewList[i].getComment());
                    }
                }
                break;
        }
    }
}
