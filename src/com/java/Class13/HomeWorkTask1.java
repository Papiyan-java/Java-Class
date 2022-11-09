package com.java.Class13;

import java.util.Scanner;

public class HomeWorkTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inter temperature in Celsius ");
        double c = sc.nextDouble();
        double f = temperatureConversion(c);

        System.out.println("This temperature in Fahrenheit is: " + temperatureConversion(c));

    }
    static double temperatureConversion(double c){
        double f = (c * 9/5 + 32);

        return f;
    }
}

