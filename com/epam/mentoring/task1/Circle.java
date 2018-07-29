package com.epam.mentoring.task1;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * (this.radius * this.radius);
    }
}