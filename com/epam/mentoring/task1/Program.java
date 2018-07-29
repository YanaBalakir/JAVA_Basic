package com.epam.mentoring.task1;

import java.util.ArrayList;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {

        FigureFactory factory = new FigureFactory();

        ArrayList<Figure> figureList = new ArrayList<>();

        figureList.add(factory.createFigure(FigureTypes.CIRCLE));
        figureList.add(factory.createFigure(FigureTypes.RECTANGLE));
        figureList.add(factory.createFigure(FigureTypes.SQUARE));


        Collections.sort(figureList);
        for (Figure f : figureList) {
            System.out.println(f.getSquare());
        }


        FigureUnit.CompareWithNumb(FigureUnit.findSquareSum(figureList), 10);
    }
}


