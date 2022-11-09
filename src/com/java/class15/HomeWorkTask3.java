package com.java.class15;

public class HomeWorkTask3 { //Java program to Print sum of 1 + 2 - 3 + 4 + 5 - 6 + 7 + 8 - 9 + 10
    public static void main(String[] args) {
        int b = 0;

        for (int a = 1; a <= 10; a++) {
            if (a % 3 == 0) {
                b = b - a;
            } else {
                b = b + a;
            }
        }
        System.out.println(b);
    }
}

