package Challenges;

import java.util.Scanner;

public class prttable {
    public static void main(String[] args){
        System.out.println("Print Table:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a=input.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(a+ "*"+i +"="+a*i);
        }
    }
}
