package com.java.class08;

import java.util.Scanner;

public class HomeWorkTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Please give me the amount of your bill");
        int total= sc.nextInt();

        if (total >= 10000){
            System.out.println("Your total after the discount would be " +( total-(total/100*20) )+ " dollars");
        } else if (total >= 5000) {
            System.out.println("Your total after the discount would be " +(total-(total/100*15))+ " dollars");

        } else if (total >=2000) {
            System.out.println("Your total after the discount would be " +(total-(total/100*10))+ " dollars");
            
        } else if (total >= 1000) {
            System.out.println("Your total after the discount would be " +(total-(total/100*5))+ " dollars");

        }else{
            System.out.println("Unfortunately you are not getting a discount");
        }


    }



}
