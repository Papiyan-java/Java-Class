package com.java.class09;

// Write a program to get age and weight from the user and print message based on following conditions

// 1. user has age more than or equal to 18 and weight more than equal to 50
// then they are eligible for blood donation
// 2. If user has age less than 18 and weight greater than 50 then
// print you're too young to donate blood
// 3. If user has age greater than 18 and weight less than 50 then
// print you're underweight. Please eat more and try again
// 4. If user has age less than 18 and weight less than 50 then
// print, you're not eligible

import java.util.Scanner;

public class LadderIfElseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inter your age");
        int a = sc.nextInt();
        System.out.println("Inter your weight");
        int w = sc.nextInt();

        if(w >= 50) {
            if (a >= 18) {
                System.out.println("eligible for blood donation");
            } else {
                System.out.println("you're too young to donate blood");
            }

        }else {
            if(a<18 ) {
                System.out.println("You're not eligible");
            } else  {

                System.out.println(" Please eat more and try again");

            }

        }

    }
}










