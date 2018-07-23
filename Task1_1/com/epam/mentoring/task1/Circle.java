package com.epam.mentoring.task1;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.square =this.getSquar();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquar() {
        return Math.PI * (this.radius * this.radius);
    }
}
