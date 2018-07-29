package com.epam.mentoring.task1;

public abstract class Figure implements Comparable {

    public abstract double getSquare();

    protected double square;


    @Override

    public int compareTo(Object another) {
        Figure figure = (Figure) another;
        if (square < figure.getSquare())
            return -1;
        else if (square == figure.getSquare())
            return 0;
        else if (square > figure.getSquare())
            return 1;
        else
            return 0;

    }
}