package com.java.class08;

import java.util.Scanner;

public class FindGreatestNumberOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Please enter second number: ");

        int num2 = sc.nextInt();

        System.out.println("Please enter third number: ");
        int num3 = sc.nextInt();

        //   if ((num1 > num2) && (num1 > num3)) {
        //System.out.println("Greatest number" + 1);

        //   } else if (num2 > num3) {

        // System.out.println("Greatest number" + 2);

        //  } else {

        // System.out.println("Greatest number is " + 3);

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1);
            } else {
                System.out.println(num3);
            }

        } else {
            if (num2 > num3) {
                System.out.println(num2);
            } else {
                System.out.println(num3);
            }

        }

    }


}