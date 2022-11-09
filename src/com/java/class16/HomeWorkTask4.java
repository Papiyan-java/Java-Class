package com.java.class16;

import java.util.Scanner;

public class HomeWorkTask4 { //Write a program to find factors of the given number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please inter a number:");
        int num = sc.nextInt();


        for (int a = 1; a <= num; a++) {
            if (num % a == 0) {
                System.out.println(a);
            }
        }
    }
}









