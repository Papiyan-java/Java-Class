package com.java.class09;

import java.util.Scanner;

public class HomeWorkTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inter the year");
        int year = sc.nextInt();

        if(year / 4 == 0 ) {
            System.out.println("It is a leap year");
        }else{
            System.out.println("It is not a leap year");



        }

    }
}
