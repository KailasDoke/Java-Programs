package Challenges;

import java.util.Scanner;
import java.util.*;
public class arrayutility {
    public static int[] inputarray(){
        Scanner input = new  Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while(i < size){
            System.out.print("Enter the elements of array  "+ (i+1)+ ":");
            arr[i]= input.nextInt();
            i++;
        }
        return arr;
    }
}
