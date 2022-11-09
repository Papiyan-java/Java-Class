package com.java.class22;
 //2. Write a program to find greatest number from an array
       //  Example
       //  Input : 23, 44, 21, 56, 27, 35, 75, 34, 25
       //  Output : Maximum - 75

public class HomeWorkTask2 {
    public static void main(String[] args) {
        int nums[] = {23, 44, 21, 56, 27, 35, 75, 34, 25};
        int max = 0;


        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println(max);
    }
}
