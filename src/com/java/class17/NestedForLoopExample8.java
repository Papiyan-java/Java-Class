package com.java.class17;

//    A
//   AAA
//  AAAAA
// AAAAAAA
//AAAAAAAAA

public class NestedForLoopExample8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            for (int s = 1; s <= 10 - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("A");
            }

            System.out.println();
        }
    }
}