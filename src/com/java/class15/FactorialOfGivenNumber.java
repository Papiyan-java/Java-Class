package com.java.class15;

import java.util.Scanner;

public class FactorialOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inter number ");

        int a = sc.nextInt();
        int result;


        for (result = 1; a <= 10; a++) {

                result = a + result;
                System.out.println(result);
            }
            //System.out.println(result);

        }
    }








