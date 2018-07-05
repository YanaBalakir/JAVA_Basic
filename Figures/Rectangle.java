package Figures;

public class Rectangle implements Figure {
    // TODO: DK: для данного таска это почти незаметно и не имеет знаечени но лучше давать осмысленные имена , например "sideA" или "sideB"
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
