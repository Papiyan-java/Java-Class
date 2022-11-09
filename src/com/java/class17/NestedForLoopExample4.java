package com.java.class17;

public class NestedForLoopExample4 {
    // A
    // AA
    // AAA
    // AAAA
    // AAAAA
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("A");
            }

            System.out.println();
        }

    }




}
