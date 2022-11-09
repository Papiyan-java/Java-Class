package com.java.class21;

import java.util.Scanner;

public class HomeWorkTask3 {
    public static void main(String[] args) {
        // Java Program to determine whether a given string is palindrome or not by ignoring the case of characters
        // and white spaces
        //Example
        //Input - Was it a car or a cat I saw
        //Output - Palindrome (edited)
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter string");
        String str = sc.nextLine().replaceAll(" ","");
        String rev="";


        for (int i = 0; i<str.length(); i++) {
            rev = rev + (str.charAt(str.length() - 1 - i));
            }
            if(str.equalsIgnoreCase(rev)){
                System.out.println(" Palindrome");
            } else {
                System.out.println("Not  Palindrome");

            }
         }
     }

