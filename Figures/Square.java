package Figures;

public class Square implements Figure {
    // TODO: DK: для данного таска это почти незаметно и не имеет знаечени но лучше давать осмысленные имена , например "squareSide" или "side"
    private double c;
    public Square (double c){
        this.c = c;
    }
    @Override
    public double area (){
        return c*c;
    }
}
