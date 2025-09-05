package com.vti.Bai3;

import java.util.ArrayList;
import java.util.List;

public class Sort {
    private long number;

    // Getter & Setter
    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    // Constructor
    public Sort(long number) {
        this.number = number;
    }

    // Methods
    public void bubbleSort() {
        String numberToString = String.valueOf(this.number);
        char[] arr = numberToString.toCharArray();
        int[] numberArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numberArray[i] = (int) arr[i];
        }

        int temp, counter, index;
        // Vòng lặp ngoài
        for (counter = 0; counter < numberArray.length; counter++) {

            // Vòng lặp trong
            for (index = 0; index < numberArray.length - 1 - counter; index++) {
                if (numberArray[index] > numberArray[index + 1]) {
                    temp = numberArray[index];
                    numberArray[index] = numberArray[index + 1];
                    numberArray[index + 1] = temp;
                }
            }
        }

        for (int i = 0; i < numberArray.length; i++){
            System.out.println(numberArray[i] + ",");
        }
    }
}
