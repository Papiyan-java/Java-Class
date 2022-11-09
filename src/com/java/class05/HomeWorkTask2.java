package com.java.class05;

import java.util.Scanner;

public class HomeWorkTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next(), str2 =sc.next(), str3;//str1=Hello, str2=Java, str3


        str3 = str2;
        str2 = str1;
        str1 = str3;

        System.out.println(str1 + str2);


    }

}
