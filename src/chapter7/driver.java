package chapter7;

public class driver {
    public static void main(String[] args){
        car c1 = new car();
        c1.addFule(5);
        System.out.println(c1.currentFuel);
        c1.drive();
        System.out.println(c1.currentFuel);
        c1.addFule(3);
        System.out.println(c1.currentFuel);
        System.out.println(c1.colour);
    }
}
