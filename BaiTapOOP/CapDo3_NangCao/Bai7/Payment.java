package BaiTapOOP.CapDo3_NangCao.Bai7;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;

public abstract class Payment {
    private int amount;
    private String currency;
    private LocalDate date;
    private Status status;

    //Constructor
    public Payment(int amount, String currency, LocalDate date, Status status) {
        this.amount = amount;
        this.currency = currency;
        this.date = date;
        this.status = status;
    }

    //Getter & Setter
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    //Method
    public void processPayment(int amount, String currency, LocalDate date, Status status){};
}
