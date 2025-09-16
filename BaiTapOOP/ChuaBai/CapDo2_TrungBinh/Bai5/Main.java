package BaiTapOOP.ChuaBai.CapDo2_TrungBinh.Bai5;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Tạo User
        User user1 = new User("Duong2015", "duong@gmail.com", "pasword@.com");
        User user2 = new User("Grox", "freakyahh@gmail.com", "ayochill@!");

        //Tạo Product
        Product minecraft = new Product("Minecraft: Java & Bedrock", 1055040, "Action & adventure, Family & kids, Simulation");
        Product cod6 = new Product("Call of Duty®", 1846320, "Shooter");
        Product skyrim = new Product("The Elder Scrolls V: Skyrim Special Edition (PC)", 1055040, "Role playing");

        //Tạo Review
        Review minecraft_review1 = new Review(user1, minecraft, 4, "This Game is so beautiful! I might cry. <3", LocalDate.now());
        Review minecraft_review2 = new Review(user2, minecraft, 5, "Ayo chill! I'm GROX, mincraft youtuber", LocalDate.now());
        Review cod6_review1 = new Review(user1, cod6, 1, "COD gone shit bruh!!", LocalDate.now());
        Review cod6_review2 = new Review(user2, cod6, 1, "who let cativision cooked again?", LocalDate.now());
        Review skyrim_review1 = new Review(user1, skyrim, 3, "Goiwng back after a while but too much glitch", LocalDate.now());
        Review skyrim_review2 = new Review(user2, skyrim, 1, "No mod no mood Bethesda suck", LocalDate.now());
        minecraft_review1.displayReview();
        minecraft_review2.displayReview();
    }

}
