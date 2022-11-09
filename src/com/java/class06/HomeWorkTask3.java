package com.java.class06;

import java.util.Scanner;

public class HomeWorkTask3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("How much is your bill?");
        double a = sc.nextDouble();
        System.out.println("What is percentage of your discount?");
        double b = sc.nextDouble();
        int c = (int) (a - (a / 100 * b));
        System.out.println("Your final bill with the discount would be " + c + " dollars");
    }
}


