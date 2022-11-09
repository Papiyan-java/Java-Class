package com.java.class09;

import java.util.Scanner;
// Get salary and age from user
// 1. If age is less than 18 then print you're not eligible
// 2. If age is more than or equal 18 and salary is less than 5000
// then print 'Sorry, you need work hard to get credit card'
// 3. If age is more than or equal 18 and salary is greater than
// or equal 5000 then print you're eligible
// 4. If age is more than or equal 18 and salary is greater than
// or equal to 20000 then print you'll get free credit card

public class NestedIfElse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your salary");
        int s = sc.nextInt();
        System.out.println("Enter your age");
        int a = sc.nextInt();

        if (a >= 18) {
            if (s > 5000) {
                System.out.println("you're eligible");
            } else {
                System.out.println("Sorry, you need work hard to get credit card'");
            }

        } else {
            if (a < 18) {
                System.out.println("You're not eligible");
            }else if (s >= 20000){
                    System.out.println("get free credit card");

                }

            }

        }

    }


