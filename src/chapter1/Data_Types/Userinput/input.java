package chapter1.Data_Types.Userinput;

import java.util.Scanner;

public class input {

public static void main(String[] args){
       Scanner input =new Scanner (System.in);
       System.out.print("Enter your name ");
       String name=input.nextLine();
       System.out.println(name);

       int a=3;
       int b=2;
       System.out.println(a+b);

    }

}
