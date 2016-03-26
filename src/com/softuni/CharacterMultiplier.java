package com.softuni;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] str = scan.nextLine().split(" ");
        int sum = charMultiplier(str[0], str[1]);

        System.out.println(sum);
    }

    public static int charMultiplier(String str1, String str2) {

        int sum = 0;
        int longerString = Math.max(str1.length(), str2.length());

        for (int i = 0; i < longerString; i++) {

            int firstCode = 1;
            int secondCode = 1;

            if (i < str1.length()) {
                firstCode = str1.charAt(i);
            }
            if (i < str2.length()) {
                secondCode = str2.charAt(i);
            }
            sum += firstCode * secondCode;
        }

        return sum;
    }
}

//other
/*
import java.util.Scanner;

public class CharacterMultiplier {
    public static int charMultiply(String big, String small) {
        int sum =0;
        for (int i = 0; i < big.length() ; i++) {
            try {
                sum += big.charAt(i) * small.charAt(i);
            }catch (StringIndexOutOfBoundsException sti){
                sum += big.charAt(i);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] imput = console.nextLine().split(" ");
        String first,second;
        if (imput[0].length() >= imput[1].length()){
            first = imput[0];
            second = imput[1];
        }else{
            first = imput[1];
            second = imput[0];
        }
        System.out.println(charMultiply(first,second));
    }
}
*/
        //other
        /*Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] strings = input.split(" ");
        System.out.println(multiplyCharacters(strings));
    }

    private static long multiplyCharacters(String[] strings) {
        String longerStr = "";
        String shorterStr = "";
        long result = 0;
        if (strings[0].length() == strings[1].length()) {
            for (int i = 0; i < strings[0].length(); i++) {
                result += (int) strings[0].charAt(i) * (int) strings[1].charAt(i);
            }
            return result;
        } else if (strings[0].length() > strings[1].length()) {
            longerStr = strings[0];
            shorterStr = strings[1];
        } else if (strings[0].length() < strings[1].length()) {
            longerStr = strings[1];
            shorterStr = strings[0];
        }

        for (int i = 0; i < shorterStr.length(); i++) {
            result += (int) longerStr.charAt(i) * (int) shorterStr.charAt(i);
        }
        int index = longerStr.length() - (longerStr.length() - shorterStr.length());
        for (int i = index; i < longerStr.length(); i++) {
            result += (int) longerStr.charAt(i);
        }

        return result;
    }
}*/