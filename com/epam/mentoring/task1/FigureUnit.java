package com.epam.mentoring.task1;

import java.util.List;

public class FigureUnit {

    public static boolean CompareWithNumb(double squareSum, double x) {

        if (squareSum > x) {
            System.out.println("SquareSum is greater than set value");
            return true;
        } else if (squareSum < x) {
            System.out.println("SquareSum is less than set value");
            return false;
        } else {

            System.out.println("SquareSum and set value are equals");
            return false;
        }

    }


    public static double findSquareSum(List<Figure> list) {
        double squareSum = 0;
        if (list == null || list.size() < 1)
            return 0;

        for (int i = 0; i < list.size(); i++) {
            squareSum += list.get(i).getSquare();
        }
        return squareSum;
    }

}