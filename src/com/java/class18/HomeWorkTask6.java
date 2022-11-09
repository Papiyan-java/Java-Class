package com.java.class18;

public class HomeWorkTask6 {
    public static void main(String[] args) {


        for (int a = 1; a <= 5; a++) {
            for (int s = 1; s <= 5 - a + 1; s++) {
                System.out.print(" ");
            }
            int b;
            for (b = 1; b <= 2 * a - 1; b++) {
                System.out.print(b);
            }

            System.out.println();
        }
        for (int a = 4; a >= 1; a--) {
            for (int s = 1; s <= 5 - a + 1; s++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= 2 * a - 1; b++) {

                System.out.print(b);
            }
            System.out.println();
        }
    }
}



