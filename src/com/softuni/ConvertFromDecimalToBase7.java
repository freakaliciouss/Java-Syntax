package com.softuni;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ConvertFromDecimalToBase7 {
    public static void main(String[] args) {

        System.out.println("Enter an intiger.");

        Scanner input = new Scanner(System.in);

        int decimalNumber = input.nextInt();
        String base7Number = Integer.toString(decimalNumber, 7);

        System.out.println(base7Number);

        //other
        /*Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(convertFromBase7ToBase10(number));
    }

    private static long convertFromBase7ToBase10(int num){
        char[] numAsStr = Integer.toString(num).toCharArray();
        long result = 0L;
        int currentIndex = numAsStr.length - 1;

        for (int i = 0; i < numAsStr.length; i++) {
            int currentDigit = Integer.parseInt(Character.toString(numAsStr[i]));
            result += currentDigit * Math.pow(7, currentIndex);
            currentIndex--;
        }

        return result;*/
    }
}
