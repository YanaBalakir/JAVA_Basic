package com.epam.mentoring.task1;

import java.util.List;

public class FigureUnit {
       // TODO: Методы принято называть с маленькой буквы.
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
        // TODO: В коллециях есть метод isEmpty() (list.isEmpty())  - место .size() < 1.
        if (list == null || list.size() < 1)
            // TODO: можно убрать return 0 , а в цикл заходить только если лист не пустой.
            return 0;
        // TODO: Для перебора всех элементов коллеции удобно использовать foreach цикл (не ошибка, но выглядет компактнее).
        for (int i = 0; i < list.size(); i++) {
            squareSum += list.get(i).getSquare();
        }
        return squareSum;
    }

}