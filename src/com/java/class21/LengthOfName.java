package com.java.class21;

import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your full name");
        String name = sc.nextLine();
         int count = 0;
        for (int i=0; i<name.length();i++){
            count++;
            //System.out.println(count);
           // System.out.println(name.indexOf());
        }
        System.out.println(count);
    }
}
