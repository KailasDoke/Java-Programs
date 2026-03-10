package Challenges.inheritance;

public class TestInheritance {
    public static void main(String[] args) {
        Vehical vehical = new Vehical();
        TwoWheeler tow = new TwoWheeler();
        vehical.commute();
        tow.commute();
    }
}
