package chapter8;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no");
        int a = input.nextInt();
        int b = input.nextInt();
//        if(a>b){
//            System.out.println("A is greater ");
//        }
//        else{
//            System.out.println("B is greater" );
//        }

        int greaterno = a > b ? a : b;
        System.out.println(greaterno+" is the greater No");
    }
}
