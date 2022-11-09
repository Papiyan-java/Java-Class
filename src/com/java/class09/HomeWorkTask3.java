package com.java.class09;

import java.util.Scanner;

public class HomeWorkTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();


        if (num > 0 ) {
            System.out.println(num / 500 + " Notes of 500");
            num = num%500;
            System.out.println(num / 100 + " Notes of 100");
            num = num%100;
            System.out.println(num  / 20 + " Notes of 20");
            num = num%20;
            System.out.println(num  / 10 + " Notes of 10");
            num = num%10;
            System.out.println(num  / 5 + " Notes of 5");
            num = num%5;
            System.out.println(num  / 2 + " Notes of 2");
            num= num%2;
            System.out.println(num + " Notes of 1");


        }


    }


    }





