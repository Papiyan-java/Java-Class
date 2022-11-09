package com.java.class22;

public class CountPositiveAndNegative {
    public static void main(String[] args) {
        int countpos = 0;
        int countneg = 0;
        int data[] = {10, -20, 30, -34, 45, 23, -45, 23, 12, -65, 23};
        for (int i = 0; i < data.length; i++) {
            if (data [i] > 0) {
                countpos++;
            }else {
                countneg++;
            }
        }
        System.out.println(countpos);
        System.out.println(countneg);
    }
}
