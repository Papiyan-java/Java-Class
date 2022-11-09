package com.java.class17;

import java.util.Scanner;

public class InClassWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int a = 0; a<=num; a++) {


            for (int s = 1; s <= num - a; s++ ) {

                System.out.print(" ");
            }
            for (int b = -4; b <= a * 2 - 1; b++) {

                System.out.print("I");

            }
            System.out.println();
        }
        System.out.println("YOU  "+" YOU  "+" YOU "+" YOU "+" YOU ");
        for(int a = 0; a<=num*num; a++){

            for(int s= 1; s>=2-a;s--){
                System.out.print(" ");
            }
            for(int b = num*num-1; b>=a*2; b--){
                System.out.print("I");
            }
            System.out.println();
        }
    }
}


