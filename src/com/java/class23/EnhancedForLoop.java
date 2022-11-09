package com.java.class23;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int data[] = {23, 44, 21, 23,23, 27, 35, 35, 44, 35};

        /*for (int i = 0; i < data.length; i++) {
            for (int j = i+1; j < data.length; j++) {

                if (data[i] == data[j]) {

                    System.out.println(data[j]);
                    break;

               }

            }*/
        for (int num : data) {
            System.out.println(num);
        }
        }
    }




