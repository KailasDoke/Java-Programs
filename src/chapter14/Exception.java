package chapter14;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Division Calaulator\n");
        System.out.println("Please enter two no: ");
        int first = input.nextInt();
        int second = input.nextInt();

        try {
            int result = first / second;
            System.out.printf("Result is %d", result);
        }
        catch(ArithmeticException e){
            System.out.println("division by zero no allowed ");
        }
    }
}
