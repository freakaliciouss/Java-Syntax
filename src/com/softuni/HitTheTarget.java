package com.softuni;

import java.util.Scanner;

public class HitTheTarget {
    public static void main(String[] args) {

        System.out.println("Enter an intiger target.");

        /*Scanner target = new Scanner(System.in);

        int number = target.nextInt();

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j == number) {
                    System.out.println(i + " + " + j + " = " + number);
                }
            }
        }
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i - j == number) {
                    System.out.println(i + " - " + j + " = " + number);
                }
            }
        }*/

        //other
        Scanner console = new Scanner(System.in);

        int target = console.nextInt();
        for (int i = 1; i < 21; i++) {
            for (int j = 1; j < 21; j++) {
                if (i + j == target) {
                    System.out.printf("%d + %d = %d\n", i, j, target);
                } else if (i - j == target) {
                    System.out.printf("%d - %d = %d\n", i, j, target);
                }
            }
        }
    }
}
