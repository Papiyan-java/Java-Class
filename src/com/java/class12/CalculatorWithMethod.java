package com.java.class12;

import java.util.Scanner;

public class CalculatorWithMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = sc.nextInt();

        System.out.println("Please enter first number");
        int num2 = sc.nextInt();

        System.out.println("Please enter your operation: ");
        String operation = sc.next();

        switch (operation.toLowerCase()) {
            case "add":
            case "+":
                Add(num1, num2);
                break;

            case "sub":
            case "-":
                Sub(num1, num2);
                break;

            case "mul":
            case "*":
                Mul(num1, num2);
                break;
            default:
                System.out.println("Please choose right operation");
        }
    }

    static void Add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    static void Sub(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    static void Mul(int num1, int num2) {
        System.out.println(num1 * num2);
    }
}















