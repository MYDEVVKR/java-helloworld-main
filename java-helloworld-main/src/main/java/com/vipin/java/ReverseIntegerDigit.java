package com.vipin.java;

public class ReverseIntegerDigit {
    public static void main(String args[]) {
        System.out.println(reverse(231));
    }

    public static int reverse(int number) {

        int reverseNumber = 0;
        String reverseNumberString = "";
//
        char numberArray[] = (number+"").toCharArray();

        for(int i = numberArray.length; i > 0; i--) {
            int num = Integer.parseInt(numberArray[i-1] + "");
            System.out.println(num);
            reverseNumberString = reverseNumberString + num;
        }

            reverseNumber = Integer.parseInt(reverseNumberString);

        return reverseNumber;

    }
}
