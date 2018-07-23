package com.epam.mentoring.task1;

public class FiguresFactory {
    public static Figure createFigure(String type) {
        switch (type) {
            case "Circle":
                return new Circle(Math.random() * 3);
            case "Rectangle":
                return new Rectangle(Math.random() * 3, Math.random() * 3);
            case "Square":
                return new Square(Math.random() * 3);
            default:
                System.out.println("The figure don't exist");
                return null;
        }
    }
}
