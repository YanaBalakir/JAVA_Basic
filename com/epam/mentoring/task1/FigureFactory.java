package com.epam.mentoring.task1;

public class FigureFactory {
    public static Figure createFigure(FigureTypes type) {
        switch (type) {
            case CIRCLE:
                return new Circle(Math.random() * 3);
            case RECTANGLE:
                return new Rectangle(Math.random() * 3, Math.random() * 3);
            case SQUARE:
                return new Square(Math.random() * 3);
            default:
                // TODO: Можно вместо возврата NULL бросвть эксепшн (например создать свой кастомный).
                System.out.println("The figure don't exist");
                return null;
        }
    }
}
