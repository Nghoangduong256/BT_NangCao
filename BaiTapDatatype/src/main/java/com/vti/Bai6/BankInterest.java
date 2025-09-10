package com.vti.Bai6;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankInterest {
    private BigDecimal p;
    private BigDecimal r;
    private int n;

    // Constructor
    public BankInterest(int p, double r, int n) {
        this.p = BigDecimal.valueOf(p);
        this.r = BigDecimal.valueOf(r);
        this.n =  n;
    }


    // Getter & Setter
    public BigDecimal getP() {
        return p;
    }

    public void setP(BigDecimal p) {
        this.p = p;
    }

    public BigDecimal getR() {
        return r;
    }

    public void setR(BigDecimal r) {
        this.r = r;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    // Methods
    public void bankInterest () {
        // Công thức chính: A=P(1+r)^n
        // (1+r)
        BigDecimal onePlusRate = BigDecimal.ONE.add(this.r);

        // P(1+r)
        BigDecimal factor = onePlusRate.multiply(this.p);

        // P(1+r)^n
        BigDecimal amount = factor.divide(BigDecimal.valueOf(this.n), 2, RoundingMode.HALF_UP);

        // interestAmount
        BigDecimal interestAmount = amount.subtract(this.p);

        System.out.println("Số tiền lãi sau " + this.n + " năm là: " + interestAmount);
    }
}
