package com.java.class07;

import java.util.Scanner;

public class IfElseExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println("What is your age? ");
        int age = sc.nextInt();

        if (age<16) {

            System.out.println("You are not allowed to have a drivers license");

        }else {

            System.out.println("You are eligible for drivers license");
        }

    }
}
