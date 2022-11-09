package com.java.class20;

public class FrequencyOfGivenCharacter {
    public static void main(String[] args) {
        String str = "Hello, How are you?";
        char target = 'e';
        System.out.println(frequencyOfGivenCharacter(str, target));
    }
    static int frequencyOfGivenCharacter(String str, char target){
        int count = 0;
        for (int i = 0; i<str.length();i++){
            if(str.charAt(i)==target){
                count++;
            }
        }
        return count;

    }
}
