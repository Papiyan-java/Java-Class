package com.java.class08;

import java.util.Scanner;

public class HomeWorkTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please give me the number");
        int num = sc.nextInt();

        if (num % 5 ==0){
            System.out.println("Divisible");
        }else{
            System.out.println("Not divisible");

        }

    }
}
