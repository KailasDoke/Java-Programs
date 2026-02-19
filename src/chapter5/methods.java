package chapter5;
// PROGRAM WHERE OBJECT IS CREATE OF FUNCTION

public class methods {
    public static void main(String[] args){

        int a=10;
        int b=10;
        methods d=new methods();
        System.out.println(d.add(a,b));
    }
    public int add(int a,int b){
//        System.out.println(a+b);
        return a+b;
    }

}
