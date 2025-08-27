package BaiTapOOP.CapDo3_NangCao.Bai7;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment1 =
                new CreditCardPayment(89000000, "VND", LocalDate.now(), Status.SUCCESS, "64548321", "NGUYEN HOANG DUONG", LocalDate.of(2027,5,25), "567", "BIDV");
        PayPalPayment payPalPayment1 = new PayPalPayment(15, "USD", LocalDate.now(), Status.SUCCESS, "hoang@gmail.com", "894eiD", "Techcombank", "Vietnam");

        creditCardPayment1.processPayment(creditCardPayment1.getAmount(), creditCardPayment1.getCurrency(), creditCardPayment1.getDate(), creditCardPayment1.getStatus());
        payPalPayment1.processPayment(payPalPayment1.getAmount(), payPalPayment1.getCurrency(), payPalPayment1.getDate(), payPalPayment1.getStatus());
    }
}
