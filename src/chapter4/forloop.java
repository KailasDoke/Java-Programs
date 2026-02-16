package chapter4;
// Program which define use of for loop and control statement
import java.util.Scanner;

public class forloop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a ");
        int a = input.nextInt();

        for(int i=0;i<=a;i++){
            if(i==5){
                continue;
            }
            System.out.println( "Value of i is :"+i );
        }
    }
}
