package com.epam.mentoring.task1;

import java.util.Arrays;
import java.util.List;

public class FigureUnit {

    public static boolean CompareWithNumb(List<Figure> list, double x) { //как правильно передать список в качестве аргумента в метод
        double squareSum = 0;
        if (squareSum > x) {
            return true;
        } else if (squareSum < x) {
            return false;
        } else {
            System.out.println("Number and SquareSum are equals");
        }
return false;
    }

    public static double findSquareSum() {
        double squareSum = 0;
        /*
        for (int i = 0; i < array.size(); i++) {
            squareSum += array.get(i).square;
        }
        */
        return 0.0;
    }
}