package com.java.class05;

public class HomeWorkTask1 {
    public static void main(String[] args) {
        String str1 = "Hello", str2 = "Java";
        int i = 10, j = 20;

        System.out.println(i + j);// 30
        System.out.println("i + j");// i + J
        System.out.println(str1 + i);// Hello10
        System.out.println(str1 + i + j);//Hello1020
        System.out.println(i + j + str1);// 30Hello
        System.out.println(str1 + i * j);// Hello300
 //     System.out.println(str1 + i - j);// error
        System.out.println(str1 + i + j + str2);// Hello1020Java

    }
}