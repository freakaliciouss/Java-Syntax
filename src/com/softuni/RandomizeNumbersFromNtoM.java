package com.softuni;

import java.util.*;

public class RandomizeNumbersFromNtoM {
    public static void main(String[] args) {

        System.out.println("Enter two integers N and M.");

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        int startNumber = Math.min(n, m);
        int endNumber = Math.max(n, m);

        ArrayList<Integer> numsList = new ArrayList<Integer>();

        for (int i = startNumber, j = 0; i <= endNumber; i++, j++) {
            numsList.add(i);
        }

        Collections.shuffle(numsList);
        System.out.print(numsList.toString().replaceAll("[\\[,\\]]+", ""));

//other
       /* Scanner console = new Scanner(System.in);
        int min = console.nextInt();
        int max = console.nextInt();
        int temp;
        if (min > max) {
            temp = min;
            min = max;
            max = temp;
        }
        int range = max - min + 1;
        List<Integer> ordered = new ArrayList<>();
        List<Integer> shuffled = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            ordered.add(i);
        }
        //System.out.println(ordered.toString());
        int ordSize = ordered.size();
        int xIndex;
        Random rnd = new Random();
        for (int i = 0; i < ordSize; i++) {
            xIndex = rnd.nextInt(range);
            shuffled.add(ordered.get(xIndex));
            ordered.remove(xIndex);
            range--;
        }
        System.out.println(shuffled.toString());*/

        //other
        /*Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int biggerNum = Math.max(n, m);
        int smallerNum = Math.min(n, m);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = smallerNum; i <= biggerNum; i++) {
            numbers.add(i);
        }

        while(numbers.size() > 0){
            Random rnd = new Random();
            int index = (rnd.nextInt(numbers.size()));
            System.out.print(numbers.get(index) + " ");
            numbers.remove(index);
        }*/
    }
}
