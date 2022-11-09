package com.java.class22;
// 1. Write a program to find the sum of even and odd numbers
//Example
//Input : 23, 44, 21, 56, 27, 35, 75, 34, 25
//Output : Sum Of Even - 134, Sum Of Odd - 206
public class HomeWorkTask1 {
    public static void main(String[] args) {

        int sumOFEven = 0;
        int sumOFOdd = 0;

        int nums[] = {23, 44, 21, 56, 27, 35, 75, 34, 25};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sumOFEven = sumOFEven + nums[i];
            } else {
                sumOFOdd = sumOFOdd + nums[i];
            }
        }
        System.out.println(sumOFOdd);
        System.out.println(sumOFEven);
    }
}




