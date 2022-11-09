package com.java.class22;
//3. Write a program to find all duplicates number from the array
// (Tricky, do enough brainstorming before solving)
      //  Example
       // Input : 23, 44, 21, 23, 27, 35, 75, 44, 25
      //  Output : Duplicate numbers - 23, 44

public class HomeWorkTask3 {
    public static void main(String[] args) {


        int nums[] = {23, 44, 21, 23,23, 27, 35, 35, 44, 35};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {

                    System.out.println(nums[j]);
                    break;

                }

            }
        }
    }
}

