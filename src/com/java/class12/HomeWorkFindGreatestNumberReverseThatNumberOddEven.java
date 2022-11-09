package com.java.class12;

import java.util.Scanner;

public class HomeWorkFindGreatestNumberReverseThatNumberOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please inter first 3 digit number");
        int a = sc.nextInt();
        System.out.println("Please inter second 3 digit number");
        int b = sc.nextInt();
        System.out.println("Please inter third 3 digit number");
        int c = sc.nextInt();


        findGreatestNumberOddEvenReverse(a, b, c);

    }

    private static void findGreatestNumberOddEvenReverse(int a, int b, int c) {

        if (a > b && a > c) {
            int a1 = a % 10;
            int a2 = a % 100 / 10;
            int a3 = a / 100;
            int r = (a1 * 100 + a2 * 10 + a3);
            if (a % 2 == 00) {
                System.out.println(a + " is greatest,it is even number and the reverse of  number is: " + r);
            } else {
                System.out.println(a + " is greatest,it is odd number and the reverse of  number is: " + r);
            }
        } else {
            if (b > a && b > c) {
                int b1 = b % 10;
                int b2 = b % 100 / 10;
                int b3 = b / 100;
                int r3 = (b1 * 100 + b2 * 10 + b3);
                if (b % 2 == 0) {
                    System.out.println(b + " is greatest,it is even number and the reverse of  number is: " + r3);
                } else {
                    System.out.println(b + " is greatest,it is odd number and the reverse of  number is: " + r3);
                }
            } else {
                if (c > a && c > b) {
                    int c1 = c % 10;
                    int c2 = c % 100 / 10;
                    int c3 = c / 100;
                    int r1 = (c1 * 100 + c2 * 10 + c3);
                    if (c % 2 == 0) {
                        System.out.println(c + " is greatest,it is even number and the reverse of  number is: " + r1);
                    } else {
                        System.out.println(c + " is greatest,it is odd number and the reverse of  number is: " + r1);

                    }
                }

            }
        }
    }
}














