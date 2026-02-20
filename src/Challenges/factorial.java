package Challenges;
//  30 CALCULATE THE FACTORIAL OF NUMBERS
public class factorial {

    public static void main(String[] args ){
        int a=10;
        fact(a);
    }
    public static void fact(int a){
        int sum=1;
        for(int i=1;i<=a;i++){

            sum=sum*i;


    }
        System.out.println("Factorial of "+a +" is "+sum);
    }
}
