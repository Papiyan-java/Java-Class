package com.java.class21;

import java.util.Scanner;

public class HomeWorkTask2 {
    public static void main(String[] args) {
        //  Java Program to remove all the white spaces from a string
        //Example
        //Input - Today is Saturday
        //Output - TodayisSaturday

        Scanner sc = new Scanner(System.in);
        System.out.println("Please inter your sentence");
        String str = sc.nextLine();
         System.out.println(str.replace(" ",""));

        }
}





