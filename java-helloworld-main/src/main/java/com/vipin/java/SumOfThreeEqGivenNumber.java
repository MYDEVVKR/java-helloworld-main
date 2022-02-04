package com.vipin.java;

import java.util.Arrays;

/**
 * Problem Statement
 * Given an array of integers and a value, determine if there are any three integers in the array whose sum equals the given value.
 *
 * Consider this array and the target sums.
 */
public class SumOfThreeEqGivenNumber {
    public static void main(String args[]) {
        int[] numbers = {1, 3, 4, 9, 34, 5, 90, 31, 11};
        int targetNumber= 35;
//        boolean foundSum = false;
//        Arrays.sort(numbers);
//        for (int i = 0; i < numbers.length; i++) {
//            foundSum =  sumofTwoEqToNumber(numbers, targetNumber, i);
//             if(foundSum) {
//                 break;
//             }
//        }

//        System.out.println(foundSum);

        System.out.println(sumOfThreeEqToNumber(numbers, targetNumber));
    }

    public static boolean sumofTwoEqToNumber(int[] leftOutArray, int leftOutNumber, int startIndex) {
        boolean ableToFoundSum = false;
        for (int i = startIndex; i < leftOutArray.length; i++) {
            if (leftOutNumber == (leftOutArray[startIndex] + leftOutArray[i])) {
                System.out.println(Arrays.toString(leftOutArray));
                System.out.println("Numbers are: "+ leftOutArray[startIndex-1] + ", " + leftOutArray[startIndex] + ", " + leftOutArray[i]  );
                ableToFoundSum = true;
                break;
            }
        }

        return ableToFoundSum;
    }

    public static boolean sumOfThreeEqToNumber(int[] numbers, int targetNumber) {
        boolean foundSum = false;
        Arrays.sort(numbers);

//        System.out.println(numbers);
        int startIndex = 0;
        for (int num: numbers) {
            int remainingSum = targetNumber - num;
            startIndex++;
            foundSum = sumofTwoEqToNumber(numbers, remainingSum, startIndex);
            if(foundSum) {
                break;
            }
        }
        return foundSum;
    }

}
