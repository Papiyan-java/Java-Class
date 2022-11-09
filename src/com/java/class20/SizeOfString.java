package com.java.class20;

import java.util.Scanner;

public class SizeOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please inter String ");
        String str = sc.next();

        int count = getNumberOfSpaces(str);
        if(count>=10) {
            System.out.println("Large");
        } else if (count>=5) {
            System.out.println("Medium");
        } else {
            System.out.println("Small");

        }
    }

    static int getNumberOfSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ') {
                count++;

            }
        }
        return count;
    }
}
