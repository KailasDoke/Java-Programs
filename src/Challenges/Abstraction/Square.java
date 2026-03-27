package Challenges.Abstraction;

public class Square  extends  abstract_83 {

    private double sideInCm;

    public Square(double sideInCm) {
        this.sideInCm = sideInCm;
    }

    public double getSideInCm(){
        return sideInCm;
    }


    @Override
    public double calculateArea() {
        return Math.pow(sideInCm,2);
    }
}
