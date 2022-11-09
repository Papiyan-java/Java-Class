package com.java.class06;

import java.util.Scanner;

public class HomeWorkTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your principle? ");
        int a = sc.nextInt();
        System.out.println("What is the rate?" );
        double r = sc.nextDouble();
        System.out.println( "For how many years?" );
        int y = sc.nextInt();
        int p = (int) (a/100*r*y);

        System.out.println("Your simple interest would be " + p + " Dollars ");

    }
}
