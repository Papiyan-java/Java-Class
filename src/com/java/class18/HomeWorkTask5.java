package com.java.class18;

public class HomeWorkTask5 {
    public static void main(String[] args) {
        for (int a = 1; a <= 5; a++) {
            for (int s = 0; s <= 5- a + 2; s++) {
                /* System.out.print(" ");*/
                /* for (int a1 = 1; a1 <= 5; a1++) {*/
                for (int s1 = 1; s1 <= 5 - a + 1; s1++) {
                    System.out.print(" ");

                }

                for (int b = 1; b <= a * 2 - 1; b++) {


                    System.out.print(b);

                }
            }


            System.out.println();
        }
    }
}






