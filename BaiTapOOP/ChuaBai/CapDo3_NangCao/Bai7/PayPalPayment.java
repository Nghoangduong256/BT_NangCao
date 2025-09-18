package BaiTapOOP.ChuaBai.CapDo3_NangCao.Bai7;

import java.time.LocalDate;

public class PayPalPayment extends Payment {
    private String email;
    private String transactionId;
    private String linkedBank;
    private String country;

    //Constructor


    public PayPalPayment(int amount, String currency, LocalDate date, Status status, String email, String transactionId, String linkedBank, String country) {
        super(amount, currency, date, status);
        this.email = email;
        this.transactionId = transactionId;
        this.linkedBank = linkedBank;
        this.country = country;
    }

    //Method


    @Override
    public void processPayment() {
        System.out.println("Thông tin thanh toán PayPal: ");
        System.out.println("Gmail: " + this.email);
        System.out.println("Transaction Id: " + this.transactionId);
        System.out.println("Country: " + this.country);
        System.out.println("Amount: " + this.getAmount() + this.getCurrency());
        System.out.println("Date: " + this.getDate());
        System.out.println("Status: " + this.getStatus());
    }

}
