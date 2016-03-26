package com.softuni;

import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {

        System.out.println("Enter 3 numbers: an integer a (0 ≤ a ≤ 500), " +
                "a floating-point b, a floating-point c and prints them in 4 virtual columns");

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        double b = input.nextDouble();
        double c = input.nextDouble();
        String aHex = Integer.toHexString(a).toUpperCase();
        String aBin = String.format("%10s", Integer.toBinaryString(a)).replace(" ", "0");

        System.out.format("|%-10s|%s|%10.2f|%-10.3f|" , aHex, aBin, b, c);

        // А може и така да се запише - |%-10x|%010d|%10.2f|%-10.3f|*/


        //other
        /*Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        int a = scanner.nextInt();
        String aToBinary = Integer.toBinaryString(a);
        //aToBinary = StringUtils.leftPad(aToBinary, 10, "0");
        scanner.nextLine();

        System.out.print("b = ");
        double b = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("c = ");
        double c = scanner.nextDouble();
        scanner.nextLine();

        System.out.printf("|%1$x |%2$s| %3$.2f|%4$.3f", a, aToBinary, b, c);*/
    }
}
