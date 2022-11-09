package com.java.class15;

public class SumOf1to5 {
    public static void main(String[] args) {
        int a;
        int result;

        for ( a = 1, result = 0; a <= 5; a++) {
            result = a + result;
        }
        System.out.println(result);

    }
}
