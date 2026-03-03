package Challenges;

import java.util.Scanner;

public class evenodd {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to find mininum");
            System.out.print("Enter the first number");
            int num1 = input.nextInt();
            String result = num1 %2 == 0? "Even" : "Odd";
            System.out.println("your number is "+result);

    }

}
