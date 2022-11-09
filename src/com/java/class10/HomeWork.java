package com.java.class10;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 3 digit number");
        int n = sc.nextInt();
        int r = getReverse(n);

        System.out.println(r);


            //if(n>=100&&n<1000) {
          //  System.out.println("The revers of interred number is: " + n4);

            //}else{
            //    System.out.println("Wrong entry !!!");
        }
        static int getReverse (int n){

            int n1 = n % 10;
            int n2 = n % 100 / 10;
            int n3 = n / 100;
            int r = (n1 * 100 + n2 * 10 + n3);

            return r;

        }

    }
