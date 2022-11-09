package com.java.class11;

import java.util.Scanner;

public class SwitchClassWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inter first number");
        int num1 = sc.nextInt();
        System.out.println("Inter second number");
        int num2 = sc.nextInt();

        System.out.println("Please choose your operator");
        String operator = sc.next();

        switch (operator) {
            case "add":
            case "+":
        System.out.println(num1 + num2);
        break;
            case "sub":
        System.out.println("num1-num2");
        break;
            case "mul":
        System.out.println("num1*num2");
        break;
            case "div":
        System.out.println("num1/num2");
        break;


        }
    }
}