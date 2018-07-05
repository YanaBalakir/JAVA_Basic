package Figures;


public class Main {
    public static void main(String[] args) {

        // TODO: DK: Можно добавить немного логирования. Сейчас послезапуска выводится куча цифр на экране. Можно было добавить что-то типо "Площади неотсортированных фигур. и т.д"

        Rectangle rectangle1 = new Rectangle(5.7, 8.5);
        Rectangle rectangle2 = new Rectangle (3.7, 4.2);
        Square square1 = new Square(11.2);
        Square square2 = new Square(9.6);
        Circle circle1 = new Circle(7.2);
        Circle circle2 = new Circle(5.2);

        List list = new List();


        list.add(rectangle1);
        list.add(rectangle2);
        list.add(square1);
        list.add(square2);
        list.add(circle1);
        list.add(circle2);

        list.printArea();
        list.sortArea();
        // TODO: DK: пропущены пункты a) c) из таска.
    }
}
