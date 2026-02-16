package chapter2;
 import java.util.Scanner;
public class swapno {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the num ");
        int num1 = num.nextInt();
        System.out.println("Value of num1 is :="+num1);
        System.out.print("Enter num");
        int num2 = num.nextInt();
        System.out.println("Value of num2 is :"+num2);
        num1=num1 + num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("Num1= "+num1);
        System.out.println("Num2= "+num2);

    }

}
