package com.java.class08;

public class LogicalOperatorExample {
    public static void main(String[] args) {

        Boolean b1 = true, b2 = false, b3 = true, b4 = false;

        System.out.println(b1 || b2);
        System.out.println(b1 && b2);
        System.out.println(b1 || b2 && b3);
        System.out.println(b1 && b2 || b3);
        System.out.println(b1 && (b2 ||b3) && (b4 || b2) && b3);
        System.out.println(b1 && b2 ||b3 && b4 && b2 && b4 || b1 && b3 && (b1||b2) || b1);

    }
}
