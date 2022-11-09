package com.java.class06;

import java.util.Scanner;

public class  HomeWorkTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give me any even number and I'll give you the square of that number. " );
        int num1 = sc.nextInt();

        int num2 = num1/2;
        System.out.println("The square of that number would be: " + num2 + "");
    }
}
