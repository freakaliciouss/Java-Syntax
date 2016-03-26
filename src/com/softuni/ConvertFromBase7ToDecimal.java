package com.softuni;

import  java.util.Scanner;

public class ConvertFromBase7ToDecimal {
    public static void main(String[] args) {

        System.out.println("Enter an intiger.");

        Scanner input = new Scanner(System.in);
        String base7Number = input.next();
        Integer decimalNumber = Integer.valueOf(base7Number, 7);

        System.out.println(decimalNumber);

        //other
        /*Scanner console = new Scanner(System.in);
        int baseSeven = console.nextInt();
        int baseDecimal=0,countPow =0;
        while (baseSeven != 0){
            baseDecimal += baseSeven%10 * Math.pow(7,countPow);
            countPow++;
            baseSeven /= 10;
        }
        System.out.println(baseDecimal);*/

        //other
        /*Scanner scanner = new Scanner(System.in);
        char[] digits = scanner.next().toCharArray();

        int result = 0;
        int exponent = 0;
        for (int i = digits.length - 1; i >= 0; i--)
        {
            result = result + Integer.parseInt(String.valueOf(digits[i])) * (int)Math.pow((double)7, (double)exponent);
            exponent++;
        }

        System.out.println(result);*/
    }
}
