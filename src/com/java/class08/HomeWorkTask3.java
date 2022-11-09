package com.java.class08;

import java.util.Scanner;

public class HomeWorkTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please rate the company on 1 to 5 scale");
        int a = sc.nextInt();

        if (a == 5){
            System.out.println("Company evaluation: " +" Very Good");
        } else if (a == 4) {
            System.out.println("Company evaluation: " +" Good");

        } else if (a == 3) {
            System.out.println("Company evaluation: " +" Average");

        } else if (a == 2) {
            System.out.println("Company evaluation: " +" Poor");
            
        }else{
            System.out.println("Company evaluation: " +" Very Poor");
        }
    }
}
