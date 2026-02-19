package chapter5;

// METHOD WITHOUT CREATING OBJECT
public class method1 {
    public static void main(String[] args){
        int a=10;
        int b=10;
        method1.add(a,b);
    }

    public static void add(int a , int b){
        System.out.println(" Addition of a and b is:"+ (a+b));
        // WHEN WE USE + THAT TIME IT CONCIDER AS STRING TO CONCANATE THE STRING
    }
}
