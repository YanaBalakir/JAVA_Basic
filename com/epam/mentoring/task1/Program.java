package com.epam.mentoring.task1;

import java.util.ArrayList;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {

        FigureFactory factory = new FigureFactory();
        // TODO: Тип листа лучше объявлять как интерфейс List (т.е. List<Figure> figureList = new ArrayList<>();)
        ArrayList<Figure> figureList = new ArrayList<>();

        figureList.add(factory.createFigure(FigureTypes.CIRCLE));
        figureList.add(factory.createFigure(FigureTypes.RECTANGLE));
        figureList.add(factory.createFigure(FigureTypes.SQUARE));


        Collections.sort(figureList);
        for (Figure f : figureList) {
            System.out.println(f.getSquare());
        }

        // TODO: При взгляде на код непонятно что делается с результатом вычисления (он не используется). У тебя вывод в консоль в методе, его можно перенести в Main. Это не ошибка (спорно)
        FigureUnit.CompareWithNumb(FigureUnit.findSquareSum(figureList), 10);
    }
}


