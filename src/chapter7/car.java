package chapter7;

public class car {
    int noOfWheels;         //INSTANCE VARIABLE
    String colour;
    float maxSpeed;
    float currentFule;
    int noSeats;


    public  void drive(){           // INSTANCE METHOD
        System.out.println("car is driving ");
        currentFule--;
    }

    public void addFule(float fule){
        currentFule +=fule;
    }
    public float currentfulelevel() {
        return currentFule;
    }

    public static void main(String[] args){
        car c1 = new car();
        c1.drive();
    }
    
}
