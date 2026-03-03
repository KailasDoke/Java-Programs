package Challenges;

import java.util.Scanner;

public class absolute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to absolute");
        int num = input.nextInt();
        int result = num>=0? num: -num;
        System.out.println("Absolute value is "+result);
    }
}
