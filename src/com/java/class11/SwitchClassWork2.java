package com.java.class11;

import java.util.Scanner;

public class SwitchClassWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number 0-3");
        int num = sc.nextInt();




        if (num == 0) {
            System.out.println("Zero");
        } else if (num == 1) {
            System.out.println("One");
        } else if (num == 3) {
            System.out.println("Three");
        } else {
            System.out.println("Error");

        }
    }


}

