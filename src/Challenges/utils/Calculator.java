package Challenges.utils;


import Challenges.geometry.circle;
import Challenges.geometry.rectangels;

public class Calculator {
    public static void main(String[] args) {

        circle c = new circle(5);
        rectangels r = new rectangels(5,2);

        double cirArea = Math.PI*Math.pow(c.radius,2);
        double rectare=r.breath* r.length;
        System.out.printf("Area of circle %f , Are of rectangle %s",cirArea,rectare);
    }
}
