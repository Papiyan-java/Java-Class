package com.java.Class13;

import java.util.Scanner;

public class HomeWorkTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = sc.nextInt();
        System.out.println("Please enter second number");
        int num2 = sc.nextInt();
        System.out.println("Please enter third number");
        int num3 = sc.nextInt();
        System.out.println("Pleas enter fourth number");
        int num4 = sc.nextInt();
       // findMax(num1,num2,num3,num4);

    }
   // static void findTheGreatestNumber(int num1, int num2, int num3, int num4){

       // if(num1>num2 && num1>num3 && num1>num4) {
           // System.out.println("Greatest number is: " + num1);
    //} else if (num2>num3 && num2>num4){
    //        System.out.println("Greatest number is: " + num2);
     //   } else if ( num3>num4) {
            //System.out.println("Greatest number is: " + num3);
      //  }else {
       //     System.out.println("Greatest number is: " + num4);
       // int max1 = findMax(num1, num2);
       // int max2 = findMax(num3, num4);

       // System.out.println("Greatest number " + findMax(max1, max2));
   // }

    static int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;

        }

    }
}
