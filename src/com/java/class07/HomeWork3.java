package com.java.class07;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write a program to print the number of days in a given month

        System.out.println("Please give me a month and I'll let you know how many days it has");
        int mon = sc.nextInt();

        if (mon <= 0) {
            System.out.println("Fail");
        } else if (mon == 1) {
            System.out.println(31 + "days");
        } else if (mon == 2) {
            System.out.println(28 + "days");
        } else if (mon == 3) {
            System.out.println(31 + "days");
        } else if (mon == 4) {
            System.out.println(30 + "days");
        } else if (mon == 5) {
            System.out.println(31 + "days");
        } else if (mon == 6) {
            System.out.println(30 + "days");
        } else if (mon == 7) {
            System.out.println(31 + "days");
        } else if (mon == 8) {
            System.out.println(31 + "days");
        } else if (mon == 9) {
            System.out.println(30 + "days");
        } else if (mon == 10) {
            System.out.println(31 + "days");
        } else if (mon == 11) {
            System.out.println(30 + "days");
        } else if (mon == 12) {
            System.out.println(31 + "days");
        } else if (mon > 12) {
            System.out.println("Error");
        }

    }

}



        
    



