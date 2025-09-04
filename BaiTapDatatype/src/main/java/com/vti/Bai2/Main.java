package com.vti.Bai2;

public class Main {
    public static void main(String[] args) {
        TimeConverter timeConverter1 = new TimeConverter(3456789);

        System.out.println("Chuyển đổi thời gian");
        System.out.println("Năm: " + timeConverter1.dayYearConverter()[0]);
        System.out.println("Ngày: " + timeConverter1.dayYearConverter()[1]);
    }

}
