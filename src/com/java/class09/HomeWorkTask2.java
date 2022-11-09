package com.java.class09;

import java.util.Scanner;

public class HomeWorkTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the units of consumed power");
        double unit = sc.nextInt();


        if (unit > 0 && unit <= 200) {
            System.out.println("The amount to be paid is " +  unit *  0.50 + " dollars");
        } else if (unit > 200 && unit <= 400) {
            System.out.println("The amount to be paid is " +  unit * 0.65 + 100 + " dollars");
        } else if (unit > 400 && unit <= 600) {
            System.out.println("The amount to be paid is " +  unit * 0.80 + 230 + " dollars");
        } else {
            System.out.println("System failure. Wrong amount of units");
        }

    }
}

