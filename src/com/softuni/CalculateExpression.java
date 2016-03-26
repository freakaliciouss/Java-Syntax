package com.softuni;

import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {

        System.out.println("Enter a, b, c on a single line.");

        Scanner console = new Scanner(System.in);
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();

        double firstFormula = Math.pow(((a * a + b * b) / (a * a - b * b)), (a + b + c) / (Math.sqrt(c)));
        double secondFormula = Math.pow((a * a + b * b - Math.pow(c, 3)), a - b);
        double numbersAverage = (a + b + c) / 3;
        double formulasAverage = (firstFormula + secondFormula) / 2;
        double difference = Math.abs(numbersAverage - formulasAverage);

        System.out.printf("F1 result: %.2f; ", firstFormula);
        System.out.printf("F2 result: %.2f; ", secondFormula);
        System.out.printf("Diff: %.2f", difference);

        //other
        /*Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double f1Result = Math.pow(((a * a + b * b) / (a * a - b * b)), (a + b + c) / Math.sqrt(c));
        double f2Result = Math.pow((a * a + b * b - c * c * c), (a - b));
        double f3Result = Math.abs((getAverage(new double[] {a, b, c})) - (getAverage(new double[] {f1Result, f2Result})));

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1Result, f2Result, f3Result);
    }

    private static double getAverage(double[] nums){
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum / nums.length;*/
    }
}
