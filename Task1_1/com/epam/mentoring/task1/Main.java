package com.epam.mentoring.task1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        FiguresFactory factory = new FiguresFactory();

        ArrayList<Figure> figureList = new ArrayList<>();

        figureList.add(factory.createFigure(Type.Rectangle));
        figureList.add(factory.createFigure("Rectangle"));
        figureList.add(factory.createFigure("Square"));
        figureList.add(factory.createFigure("dsds"));
        // добавить try ...catch если тип фигуры другой или можно в методе createFigure прописать trows


        /*Figure[] figureList = {
                new Rectangle(),
                new Rectangle(Math.random()*3, Math.random()*3),
                new Circle(Math.random()*3), new Circle(Math.random()*3)};*/

        Collections.sort(figureList);
        for (Figure f : figureList) {
            //System.out.println(f.getSquar());
        }


    }
}
