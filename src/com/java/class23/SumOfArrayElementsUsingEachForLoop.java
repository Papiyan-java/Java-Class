package com.java.class23;

public class SumOfArrayElementsUsingEachForLoop {
    public static void main(String[] args) {
        int sum =0;
        int data[] = {23, 44, 21, 23,23, 27, 35, 35, 44, 35};
        for (int num : data) {
            sum=sum+num;

        }
        System.out.println(sum);
    }
}
