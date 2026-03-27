package Challenges.Abstraction;

public class circle extends abstract_83 {
    private final double radiousIncm ;

    public circle(double radiousTncm){
        this.radiousIncm =radiousTncm;
    }

    public  double getRadiousInCm(){
        return radiousIncm;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radiousIncm*radiousIncm;
    }
}
