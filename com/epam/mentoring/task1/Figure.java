package com.epam.mentoring.task1;
// TODO: Comparable можно (и нужно ) параметризировать (generic) Comparable<Figure>. Это избавит от возможности передавать для сравнения другой объект кроме Figure.
public abstract class Figure implements Comparable {

    public abstract double getSquare();

    // TODO: Поле square нигде не инициализируется. по умолчанию оно "0.0" и никогда не изменяется. Соответственно сравнение работает неправильно.
    protected double square;


    @Override

    public int compareTo(Object another) {
        Figure figure = (Figure) another;
        // TODO: При твоей имплементации правильно было бы вызывать getSquare() а не использовать значение 'square'.
        if (square < figure.getSquare())
            return -1;
        else if (square == figure.getSquare())
            return 0;
        else if (square > figure.getSquare())
            return 1;
        // TODO: Для чего ещё один else ? Код сюда никогда не зайдёт.
        else
            return 0;

    }
}