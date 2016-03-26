package com.softuni;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        System.out.println("Enter the sides of a rectangle (a and b)");

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int area = a * b;

        System.out.println("Area = " + area);

//other
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("The following program calculates the area of a rectangle " +
                "with user input lenghth and width.");

        double area = 0;
        while (area <= 0) {
            System.out.println("Please enter positive numeric values for width and length.");
            System.out.print("Width: ");
            String inputWidth = scanner.nextLine();
            while (!tryParseDouble(inputWidth)) {
                System.out.println("Width should be positive numeric value.");
                System.out.print("Width: ");
                inputWidth = scanner.nextLine();
            }

            double width = Double.parseDouble(inputWidth);

            System.out.print("Length: ");
            String inputLength = scanner.nextLine();
            while (!tryParseDouble(inputLength)) {
                System.out.println("Length should be positive numeric value.");
                System.out.print("Length: ");
                inputLength = scanner.nextLine();
            }

            double length = Double.parseDouble(inputLength);

            area = length * width;
        }

        System.out.println("Area: " + area);
    }

    private static boolean tryParseDouble(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
*/

//other
       /* Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int area = calculateRectangleArea(a, b);
        System.out.println(area);
    }

    private static int calculateRectangleArea(int a, int b){
        int area = a * b;
        return area;*/
    }
}
