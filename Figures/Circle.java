// TODO: DK: Имя пакета принято начинать с домена компании "com.epam", также обычно пакеты называют маленькими буквами.


package Figures;

public class Circle implements Figure {
    // TODO: Если добавлять пустые строки между именем класса, объявлением переменных, методами код будет визуально лучше воспринимать. (IDEA - Ctrl+Alt+L - сделает форматирование.)
    private double r; //радиус
    public Circle (double r){
        this.r = r;
    }
    @Override
    public double area(){
        return Math.PI * (r*r);
    }
}
