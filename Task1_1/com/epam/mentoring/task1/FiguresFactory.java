package com.epam.mentoring.task1;

public class FiguresFactory {
    public static Figure createFigure(Type type) {
        switch (type) {
            case CIRCLE:
                return new Circle(Math.random() * 3);
            case Rectangle:
                return new Rectangle(Math.random() * 3, Math.random() * 3);
            case Triangle:
                return new Square(Math.random() * 3);
            default:
                System.out.println("The figure don't exist");
               throw  new InvalidTypeException("Invalid figure type");
        }
    }
}
