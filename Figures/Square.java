package Figures;

public class Square implements Figure {
    private double c;
    public Square (double c){
        this.c = c;
    }
    @Override
    public double area (){
        return c*c;
    }
}
