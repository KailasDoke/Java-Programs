package chapter10.kd;

public class Car {
    public String color;
    public String model;
    private double furlLevel;
    long costOfPurchase;

     public Car(){

    }
    public Car(String color, String model, double furlLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.furlLevel = furlLevel;
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", furlLevel=" + furlLevel +
                ", costOfPurchase=" + costOfPurchase +
                '}';
    }
}
