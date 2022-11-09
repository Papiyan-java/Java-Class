package com.java.class07;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write a program to print a given number that is positive, negative, or zero

        System.out.println("Please give me the number");
        double num = sc.nextDouble();

        if (num ==0) {
            System.out.println("Zero");
        } else if (num>0) {
            System.out.println("Positive");
        } else if (num<0) {
            System.out.println("Negative");
            
        }

    }
        }




    

