package Challenges;
import java.util.Scanner;
public class chal4_15 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Hellow world ");
        System.out.print("Enetr no:");
        int a=input.nextInt();
        if (a==0){
            System.out.println("Number is Zero:"+a);

        } else if (a<0) {
            System.out.println("Number is Negative :"+a);

        }
        else {
            System.out.println("Number is Positive :"+a);
        }

        input.close();
    }
}
