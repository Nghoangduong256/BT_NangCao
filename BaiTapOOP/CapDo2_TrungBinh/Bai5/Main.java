package BaiTapOOP.CapDo2_TrungBinh.Bai5;


import java.time.LocalDate;

import static BaiTapOOP.CapDo2_TrungBinh.Bai5.Review.displayReview;

public class Main {
    public static void main(String[] args) {
        //Tạo User
        User user1 = new User("Duong2015", "duong@gmail.com", "pasword@.com");
        User user2 = new User("Grox", "freakyahh@gmail.com", "ayochill@!");

        //Tạo Product
        Product minecraft = new Product("Minecraft: Java & Bedrock", 39.99f, "Action & adventure, Family & kids, Simulation");
        Product cod6 = new Product("Call of Duty®", 69.99f, "Shooter");
        Product skyrim = new Product("The Elder Scrolls V: Skyrim Special Edition (PC)", 39.99f, "Role playing");

        //Tạo Review
        Review minecraft_review1 = new Review();
        minecraft_review1.setUser(user1);
        minecraft_review1.setProduct(minecraft);
        minecraft_review1.setRating(4);
        minecraft_review1.setComment("This Game is so beautiful! I might cry. <3");
        minecraft_review1.setCreatedAt(LocalDate.now());

        Review minecraft_review2 = new Review();
        minecraft_review2.setUser(user2);
        minecraft_review2.setProduct(minecraft);
        minecraft_review2.setRating(5);
        minecraft_review2.setComment("Ayo chill! I'm GROX, mincraft youtuber");
        minecraft_review2.setCreatedAt(LocalDate.now());

        Review cod6_review1 = new Review();
        cod6_review1.setUser(user1);
        cod6_review1.setProduct(cod6);
        cod6_review1.setRating(1);
        cod6_review1.setComment("Call of Duty has trash servers. Half the time you're not on a real server you're on\n" +
                "peer to peer, meaning some random dude's console is hosting the game. If they\n" +
                "lag, you lag. And if your connection is actually good, the game punishes you with\n" +
                "lag compensation to help people with bad Wi-Fi. You lose fights you should've\n" +
                "won, shots don't register, and you die behind walls. The devs don't care,\n" +
                "Activision is lazy and greedy. They just want fast matchmaking and your money.\n" +
                "They don't even optimize their game it runs like garbage no matter how good\n" +
                "your PC is. Meanwhile, Valve actually runs real servers, cares about gameplay,\n" +
                "and listens to their community. That's why CS2 feels fair and Call of Duty doesn't.\n" +
                "Don't waste your time.");
        cod6_review1.setCreatedAt(LocalDate.now());

        Review cod6_review2 = new Review();
        cod6_review2.setUser(user2);
        cod6_review2.setProduct(cod6);
        cod6_review2.setRating(1);
        cod6_review2.setComment("STOP RUINING THE GAME WE ALL USE TO LOVE. I CANT EVEN TAKE THE GAME SERIOUSLY ANYMORE WITH BEVIS AND BUTTHEAD SHOOTING\n" +
                "AT NINJA TURTLES. WHO ASKED FOR THIS ??? GO BACK TO WHAT MADE THE FRANCHISE SUCCESSFUL. WE WANT BLACK OPS 2, WORLD AT\n" +
                "WAR, AND CLASSIC MW2. HELL REMASTER THOSE AND STOP TRYING TO BE FORTNITE!");
        cod6_review2.setCreatedAt(LocalDate.now());

        Review skyrim_review1 = new Review();
        skyrim_review1.setUser(user1);
        skyrim_review1.setProduct(skyrim);
        skyrim_review1.setRating(3);
        skyrim_review1.setComment("I love the game, but this glitch where my mouse keeps duplicating itself every time I move it and also there is a little screen that shows me the\n" +
                "loading on the top left corner even though I have it open and on the main menu. I've tried many ways to fix this but it never works. this game on\n" +
                "my computer is in a unplayable state, I have spent many hours on this game and this happens I would appreciate if anyone could help");
        skyrim_review1.setCreatedAt(LocalDate.now());

        Review skyrim_review2 = new Review();
        skyrim_review2.setUser(user2);
        skyrim_review2.setProduct(skyrim);
        skyrim_review2.setRating(1);
        skyrim_review2.setComment("Completely unable to use 99% of mods because Skyrim Script Extender can not support the gamepass version due to Microsoft ******* , do not\n" +
                "buy if you wish to mod the game at all");
        skyrim_review2.setCreatedAt(LocalDate.now());

        Review[] reviewList = {minecraft_review1, minecraft_review2, cod6_review1, cod6_review2, skyrim_review1, skyrim_review2};

        displayReview(reviewList);
    }

}
