package Figures;

public class Circle implements Figure {
    private double r; //радиус
    public Circle (double r){
        this.r = r;
    }
    @Override
    public double area(){
        return Math.PI * (r*r);
    }
}
