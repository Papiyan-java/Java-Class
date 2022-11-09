package com.java.class16;

import java.util.Scanner;

public class MaxDigitFromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = num % 10;
        while (num != 0){
            int lastDigit = num %10;
            if(max < lastDigit){
                max = lastDigit;
            }
            num = num / 10;
        }
        System.out.println(max);


    }
}
