package Challenges.inheritance;

public class ArrayOperation {
    private int[] number;

    public ArrayOperation(int[] number) {
        this.number = number;
    }

    public  class Statistics{

         double mean() {
             double sum = 0;
             for (int numbers : number) {
                 sum += numbers;
             }
             return sum / number.length;
         }
            double median(){
            return 0;
        }
    }
}
