package chapter6;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args){

        Scanner input = new  Scanner(System.in);
        int[] arr = {10,20,30,40};
        System.out.println("Enter no to find in array ");
        int a = input.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                System.out.println("array element found ");
            }

        }

    }
}
