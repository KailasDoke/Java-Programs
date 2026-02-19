package Challenges;
// CHALLENGE NO.29  SUM OF ODD NUMBERS
public class sumodd {
    public static void main(String[] args){
        System.out.println("print sum of odd no");
        int a=5;
        int sum=0;
        for(int i =1;i<=a;i++){
            if(i%2 != 0){
                 sum= sum+i;

             }

        }
        System.out.println("Sum od odd no is: "+sum);
    }
}
