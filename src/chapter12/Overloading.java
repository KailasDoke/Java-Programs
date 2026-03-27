package chapter12;

public class Overloading {
    public int sum(int a, int b) {
        return a + b;

    }
    Overloading(int a){
        System.out.println("hellow "+ a);
    }

    Overloading(int a , int b){
        System.out.println("with tow veriables "+a+" "  +b);
    }
    public int sum(int a,int b, int c, int d){
        return a + b + c+ d;
    }

    public static void main(String[] args) {
        Overloading o = new Overloading(1);
        Overloading a = new Overloading(1,2);
        //System.out.println(o.sum(1, 2));
        //System.out.println(o.sum(1,2,3,4));
    }
}
