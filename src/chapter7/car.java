package chapter7;

public class car {
    int noOfWheels;         //INSTANCE VARIABLE
    String colour;
    float maxSpeed;
    float currentFuel;
    int noSeats;


    public  void drive() {
        if (currentFuel == 0) {
            System.out.println("car is out of fule ");
        }// INSTANCE METHOD
        else if (currentFuel <= 5) {
            System.out.println(" car is on reserved mode ");
            currentFuel--;
        } else {
            System.out.println("car is driving ");
            currentFuel--;
        }
    }

        public void addFule ( float fuel){
            currentFuel += fuel;

        }
        public float currentfulelevel () {
            return currentFuel;
        }


    
}
