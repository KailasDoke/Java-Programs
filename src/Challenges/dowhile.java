package Challenges;
import  java.util.Scanner;
public class dowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        do {
            System.out.print("Enter the age :");
             age = input.nextInt();
        }while (age < 0 || age > 100);
        System.out.println("Your age is :"+age);

        for(int i = 0; i<=100; i++){
            System.out.println("2"+"*"+i+ "=" +i*2);
        }
    }

}