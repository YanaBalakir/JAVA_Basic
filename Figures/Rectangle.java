package Figures;

public class Rectangle implements Figure {
    private double a,b;
    public Rectangle (double a, double b){
        this.a = a;
        this.b = b;
    }
    @Override
    public double area(){
        return a*b;
    }
}
