package chapter6;
import java.util.*;
public class Array_input {
    public static void main(String[] args  ){
        Scanner input= new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0;i<arr.length; i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
