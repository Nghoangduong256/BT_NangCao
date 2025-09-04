package com.vti.Bai1;

public class Main {
    public static void main(String[] args) {
        LengthConverter lengthConverter1 = new LengthConverter(3201);

        System.out.println("Chuyển đổi sang mét");
        System.out.println("Input: " + lengthConverter1.getInch());
        System.out.println("Output: " + lengthConverter1.meterConverter(lengthConverter1.getInch()));
    }
}
