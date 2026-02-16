package Challenges;
import java.util.*;
public class number_is_even_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = input.nextInt();
        if(a%2==0){
            System.out.println("Number is Even");

        } else if(a%2 != 0){
            System.out.println("Number is odd ");
        }
    }
}