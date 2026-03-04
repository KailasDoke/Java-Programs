package Challenges;
import java.util.Scanner;
public class passwordchecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PASSWORD CHECKER \n");
        String pass;
        do {
            System.out.println("Eneter the password ");
            pass = input.next();
        } while(!isvalidpass(pass));
        System.out.println("thanks");
    }
    public static boolean isvalidpass(String pass){

        return pass.length() > 6;
    }
}
