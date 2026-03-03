package Challenges;
import java.util.Scanner;
public class minimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to find mininum");
        System.out.print("Enter the first number");
        int num1 = input.nextInt();
        System.out.println("Enter the second number");
        int num2 = input.nextInt();
        minimum m = new minimum();
        int n = m.min(num1,num2);
        System.out.println("Minimum number is "+ n);


    }
    public int min(int num1, int num2){

        return num1<num2 ? num1 : num2;
    }
}
