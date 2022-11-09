package com.java.class21;

import java.util.Scanner;

public class HomeWorkTask1 {
    public static void main(String[] args) {
        //Java Program to count the total number of vowels and consonants in a string
        //Example
        //Input - Today is Saturday
        //Output - Total Vowels - 6, Total Consonants -  9
        Scanner sc = new Scanner(System.in);
        System.out.println("Pleas inter string");
        String str = sc.nextLine();

        int vow=0;
        int cons=0;

        for(int i = 0; i<str.length();i++){
            char ch = str.toLowerCase().charAt(i);
            if(ch=='a'||ch=='o'||ch=='e'||ch=='u'||ch=='i'){
                vow++;
            }else if (ch>='a'&&ch<='z'){
                cons++;
            }
        }

        System.out.println( vow +" vowels");
        System.out.println( cons +" consonants");
    }
}
