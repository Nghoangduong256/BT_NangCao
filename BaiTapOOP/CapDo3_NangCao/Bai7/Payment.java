package BaiTapOOP.CapDo3_NangCao.Bai7;

public abstract class Payment {
    private int amount;

    //Constructor
    public Payment(int amount) {
        this.amount = amount;
    }

    //Method
    public void processPayment(int amount){};
}
