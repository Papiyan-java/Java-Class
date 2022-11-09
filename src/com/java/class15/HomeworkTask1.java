package com.java.class15;

public class HomeworkTask1 { //Java program to print the sum of even numbers from 1 to 10

    public static void main(String[] args) {
        int b = 0;

        for (int a = 1; a <= 10; a++) {
            if (a % 2 == 0) {
                b = b + a;
            }

        }
        System.out.println(b);
    }
}



