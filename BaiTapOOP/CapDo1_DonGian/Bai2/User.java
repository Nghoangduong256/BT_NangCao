package BaiTapOOP.CapDo1_DonGian.Bai2;

public class User {
    private String username;
    private String email;
    private String password;

    //Constructor
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    //Getter & Setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void kiemTraDangNhap (User user, String username, String gmail, String password) {
        //Validate
        //Kiểm tra Username
        if (username.isEmpty() || !(user.getUsername().equals(username))){
            throw new RuntimeException("Username không đúng, vui lòng đăng nhập lại");
        } else {

        }

        //Kiểm tra Gmail
        if (gmail.isEmpty() || !(user.getEmail().contains("@gmail.com")) || !(user.getEmail().equals(gmail))){
            throw new RuntimeException("Gmail không đúng, vui lòng đăng nhập lại");
        }

        //Kiểm tra Password
        if (password.isEmpty() || !(user.getPassword().equals(password))){
            throw new RuntimeException("Password không đúng, vui lòng đăng nhập lại");
        }

        //Đăng nhập thành công
        System.out.println("Đăng nhập thành công!");
        System.out.println("Welcome " + user.getUsername());
    }
}
