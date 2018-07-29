package com.epam.mentoring.task1;

public class Square extends Figure {

    private double squareSide;

    public Square(double squareSide) {
        this.squareSide = squareSide;
    }

    public double getSquareSide() {
        return squareSide;
    }

    public void setSquareSide(double squareSide) {
        this.squareSide = squareSide;
    }


    @Override
    public double getSquare() {
        return this.squareSide * this.squareSide;
    }

}