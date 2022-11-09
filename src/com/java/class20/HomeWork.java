package com.java.class20;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        //First approach
        Scanner sc = new Scanner(System.in);
        System.out.println("Please inter your first and last name");
        String name = sc.nextLine();

        String initial1 =""+ name.charAt(0);
        String initial2 =""+(name.charAt(name.indexOf(" ") + 1));

        System.out.println(initial1 + "." + initial2);


        // Second approach

        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)==(' ')){
                System.out.println(name.charAt(0)+"."+name.charAt(i+1));


                ///
                int count = 0;
                for(int j = 0; j<name.indexOf(name); j-- ){
                    count++;
                }
                System.out.println(count);


            }

        }
    }
}

