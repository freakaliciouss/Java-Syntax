package com.softuni;

import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        String[] strArr = str.split(" ");

        if (strArr.length % 2 != 0) {
            System.out.println("Invalid length");
        } else {

            for (int i = 0; i < strArr.length - 1; i += 2) {

                int a = Integer.parseInt(strArr[i]);
                int b = Integer.parseInt(strArr[i + 1]);

                if ((a + b) % 2 != 0) {
                    System.out.printf("%d, %d -> different\n", a, b);
                } else if (a % 2 != 0) {
                    System.out.printf("%d, %d -> both are odd\n", a, b);
                } else {
                    System.out.printf("%d, %d -> both are even\n", a, b);
                }
            }
        }

//other
    /*public static boolean isEven (int number) {
        return (number % 2 == 0);
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] imput = console.nextLine().split(" ");
        int[] payrs = new int[imput.length];
        if ( imput.length % 2 != 0){
            System.out.println("Invalid length");
        }else{
            for (int i = 0; i < imput.length-1; i+=2) {
                payrs[i] = Integer.parseInt(imput[i]);
                payrs[i+1] = Integer.parseInt(imput[i+1]);
                if ( isEven(payrs[i]) && isEven(payrs[i+1])){
                    System.out.printf("%d, %d -> both are even\n",payrs[i],payrs[i+1]);
                }else if ( !isEven(payrs[i]) && !isEven(payrs[i+1])){
                    System.out.printf("%d, %d -> both are odd\n",payrs[i],payrs[i+1]);
                }else{
                    System.out.printf("%d, %d -> different\n",payrs[i],payrs[i+1]);
                }
            }

        }*/

    }
}

