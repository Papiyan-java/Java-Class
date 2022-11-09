package com.java.class16;

public class HomeWorkTask3 { // Java program to find result of 1/2 + 2/3 + 3/4 + 4/5 +......10/11
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        double sum = 0;
        while (a < 10 && b < 11) {
            a++;
            b++;
            sum=  sum+(double) a/b;
        }
        System.out.println(sum);
        System.out.println((int)sum);

    }
}
