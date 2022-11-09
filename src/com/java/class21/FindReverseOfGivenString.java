package com.java.class21;

import java.util.Scanner;

public class FindReverseOfGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String name = sc.nextLine();


        for (int i= name.length()-1; i>=0;i--){

            System.out.print(name.charAt(i));
        }
        System.out.println();



    }

}

