package BaiTapOOP.CapDo3_NangCao.Bai7;

public class PayPalPayment extends Payment{
    private String payPalMail;
    private String payPalPassword;

    //Constructor
    public PayPalPayment(int amount, String payPalMail, String payPalPassword) {
        super(amount);
        this.payPalMail = payPalMail;
        this.payPalPassword = payPalPassword;
    }

    @Override
    public void processPayment(int amount) {
        super.processPayment(amount);

    }
}
