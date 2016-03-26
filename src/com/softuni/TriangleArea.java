package com.softuni;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        System.out.println("Enter 3 points in the plane (as integer x and y coordinates)");
        Scanner console = new Scanner(System.in);

        int aX = console.nextInt();
        int aY = console.nextInt();
        int bX = console.nextInt();
        int bY = console.nextInt();
        int cX = console.nextInt();
        int cY = console.nextInt();

        int area = (aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2;
        System.out.println("Area = " + Math.abs(area));

        //other
       /* Scanner console = new Scanner(System.in);
        int[] pointX = new int[3];
        int[] pointY = new int[3];
        for (int i = 0; i < 3; i++) {
            pointX[i] = console.nextInt();
            pointY[i] = console.nextInt();
        }
        int area1 = pointX[0]*(pointY[1]-pointY[2]);
        int area2 = pointX[1]*(pointY[2]-pointY[0]);
        int area3 = pointX[2]*(pointY[0]-pointY[1]);
        System.out.printf("%.0f",Math.abs((area1+area2+area3)*0.5));*/

        //other
        /*Scanner scan = new Scanner(System.in);
        int aX = scan.nextInt();
        int aY = scan.nextInt();
        int bX = scan.nextInt();
        int bY = scan.nextInt();
        int cX = scan.nextInt();
        int cY = scan.nextInt();
        int area = calculateTriangleArea(aX, aY, bX, bY, cX, cY);
        System.out.println(area);
    }

    private static int calculateTriangleArea(int aX, int aY, int bX, int bY, int cX, int cY){
        int area = Math.abs(((aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2));
        return area;*/
    }
}
