package com.java.class15;

public class HomeWorkTask2 { //Java program to print the sum of 1 to 50 numbers which are divisible by 5 or by 3
    public static void main(String[] args) {

        int b = 0;

        for (int a = 1; a <= 50; a++) {

            if (a % 5 == 0 || a % 3 == 0) {

                b = a + b;


            }
        }
        System.out.println(b);

    }
}


