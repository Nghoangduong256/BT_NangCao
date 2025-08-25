package BaiTapOOP.CapDo3_NangCao.Bai7;

import java.util.Date;

public class CreditCardPayment extends Payment{
    private String cardNumber;
    private String cardName;
    private Date expiredDate;
    private String cvc;
    private String country;

    public CreditCardPayment(int amount, String cardNumber, String cardName, Date expiredDate, String cvc, String country) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.expiredDate = expiredDate;
        this.cvc = cvc;
        this.country = country;
    }


}
