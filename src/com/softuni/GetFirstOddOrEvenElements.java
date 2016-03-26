package com.softuni;

import java.util.ArrayList;
import java.util.Scanner;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] numbersStr = scan.nextLine().split(" ");
        String[] input = scan.nextLine().split(" ");
        int digit = Integer.parseInt(input[1]);
        String oddEven = input[2];
        int[] numbers = new int[numbersStr.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }

        if (oddEven.equals("odd")) {
            printNumbers(numbers, digit, 1);
        } else {
            printNumbers(numbers, digit, 0);
        }

    }

    private static void printNumbers(int[] numbers, int digit, int evenOdd) {
        for (int i = 0; i < numbers.length; i++) {
            if (digit == 0) {
                break;
            }
            if (numbers[i] % 2 == evenOdd) {
                digit--;
                System.out.print(numbers[i] + " ");
            }
        }
    }

//other
    /*public static boolean isEven(int number) {
        return (number % 2 == 0);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] imput = console.nextLine().split(" ");
        String[] command = console.nextLine().split(" ");
        int[] numbers = new int[imput.length];
        for (int i = 0; i < imput.length; i++) {
            numbers[i] = Integer.parseInt(imput[i]);
        }
        int count = Integer.parseInt(command[1]);
        for (int i = 0; i < numbers.length; i++) {
            if (command[2].equals("even") && isEven(numbers[i]) && count > 0) {
                System.out.printf("%d ", numbers[i]);
                count--;
            } else if (command[2].equals("odd") && !isEven(numbers[i]) && count > 0) {
                System.out.printf("%d ", numbers[i]);
                count--;
            }
        }
    }*/

        //other
        /*Scanner scan = new Scanner(System.in);
        String numbersAsString = scan.nextLine();
        String command = scan.nextLine();
        String[] numbersArr = numbersAsString.split(" ");
        int[] numbers = new int[numbersArr.length];
        for (int i = 0; i < numbersArr.length; i++) {
            numbers[i] = Integer.parseInt(numbersArr[i]);
        }

        String[] commandArgs = command.split(" ");
        int numberOfElements = Integer.parseInt(commandArgs[1]);
        String type = commandArgs[2];
        ArrayList<Integer> result = getFirstOddOrEvenElements(numbers, numberOfElements, type);
        for (int element: result) {
            System.out.print(element + " ");
        }
    }

    private static ArrayList<Integer> getFirstOddOrEvenElements(int[] arr, int numberOfElements, String type) {
        ArrayList<Integer> elementsFound = new ArrayList<Integer>();
        switch (type) {
            case "even":
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 == 0) {
                        elementsFound.add(arr[i]);
                        if (elementsFound.size() > numberOfElements) {
                            break;
                        }
                    }
                }
                break;
            case "odd":
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 != 0) {
                        elementsFound.add(arr[i]);
                        if (elementsFound.size() > numberOfElements) {
                            break;
                        }
                    }
                }
                break;
        }
        return elementsFound;
    }*/
}
