package chapter10.kd;

public class AccessTest {
    public static void main(String[] args) {
        Car c = new Car();
        c.color="red";
        c.model="Swift";
        //c.costOfPurchase = 7893;
        System.out.println(c);

        Car newcar = new Car("red","xuv700",1,12344 );
        System.out.println(newcar);
    }

}
