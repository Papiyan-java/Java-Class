package com.java.class16;

public class FindLengthOfNumber {
    public static void main(String[] args) {
        int a = 123;
        int b = 0;

        while (a>0){
            a=a/10;
            b++;

        }
        System.out.println(b);


    }
}
