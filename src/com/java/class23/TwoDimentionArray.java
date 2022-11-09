package com.java.class23;

public class TwoDimentionArray {
    public static void main(String[] args) {

        //declaration of 2D arrey
        int data[][];

        //Declare and assign in one line
        int info[][] = {{23, 44, 21}, {56, 27, 35}, {75, 34, 25}};

        //Declaration and initialization of array
        int num[][]=new int[2][3];

        //Find number of rows in the array
        System.out.println(num.length);

        //Find number of column in the array
        System.out.println(num[0].length);

        //Print data at particular
        System.out.println(num[1][1]);

        //Print all data for 2D array using index based for loop
        for(int i = 0;i<info.length; i++){
            for (int j=0;j<info[i].length;j++){
                System.out.print(info[i][j]+" ");
            }
            System.out.println();
        }



    }
}
