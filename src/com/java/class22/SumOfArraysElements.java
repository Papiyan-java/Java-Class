package com.java.class22;

public class SumOfArraysElements {
    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 34, 45, 23, 45, 23, 12, 65, 23};
          int sum=0;
        for (int i=0;i<nums.length; i++){
          sum= sum+nums[i];


        }
        System.out.println(sum);
    }
}
