package chapter8;
import java.util.Scanner;

import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WElCOME TO FACTORIAL GENRATROR\n");
        System.out.print("Enter the number");
        int num = input.nextInt();
        long fact=factorial(num);
        System.out.println("factorial of "+num+" is "+fact);
    }

    public static long factorial(int num){
        if (num == 1) {
            return 1;

        }
        return num * factorial(num - 1);
    }

    public static long factorial1(int num){

        long result=1;
        for(int i =1; i<=num;i++){
             result *=i;

        }
        return result;
    }
}
