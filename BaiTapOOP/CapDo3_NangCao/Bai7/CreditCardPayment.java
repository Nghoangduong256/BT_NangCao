package BaiTapOOP.CapDo3_NangCao.Bai7;

import java.time.LocalDate;
import java.util.Date;

public class CreditCardPayment extends Payment{
    private String cardNumber;
    private String cardHolder;
    private LocalDate expiryDate;
    private String cvc;
    private String issuerBank;

    //Constructor

    public CreditCardPayment(int amount, String currency, LocalDate date, Status status, String cardNumber, String cardHolder, LocalDate expiryDate, String cvc, String issuerBank) {
        super(amount, currency, date, status);
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expiryDate = expiryDate;
        this.cvc = cvc;
        this.issuerBank = issuerBank;
    }

    //Getter & Setter
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public String getIssuerBank() {
        return issuerBank;
    }

    public void setIssuerBank(String issuerBank) {
        this.issuerBank = issuerBank;
    }

    //Method
    @Override
    public void processPayment(int amount, String currency, LocalDate date, Status status) {
        super.processPayment(amount, currency, date, status);
        System.out.println("Thông tin thanh toán CreditCard: ");
        System.out.println("Card Name: " + this.cardHolder);
        System.out.println("Card Number: " + this.cardNumber);
        System.out.println("Amount: " + amount + currency);
        System.out.println("Date: " + date);
        System.out.println("Status: " + status);
    }


}
