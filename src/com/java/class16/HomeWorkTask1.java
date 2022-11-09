package com.java.class16;

import java.util.Scanner;

public class HomeWorkTask1 { //Write a program to print sum of each digit from the given number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = sc.nextInt();
        int sum = 0;

        while (num != 0) {
            int lastDigit = num % 10;
             num=num/10;
            sum = sum + lastDigit ;

        }
        System.out.println(sum);
    }
}
