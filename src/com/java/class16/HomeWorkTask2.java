package com.java.class16;

public class HomeWorkTask2 { //Java program to find result of 10 + 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        int sum = 0;

        while (a<=b){
            b--;
            a++;
            sum = sum + a + b;
        }
        System.out.println(sum);
    }
}
