package Challenges.Abstraction;

public class TestShapes {
    public static void main(String[] args) {
        // we can not create the object of the abstract class
        // abstract_83 a = new abstract_83();
        circle c = new circle(5);
        Square s = new Square(5);
        System.out.println("Area of the circle: "+c.calculateArea());
        System.out.println("Are of the square "+s.calculateArea()   );
    }

}
