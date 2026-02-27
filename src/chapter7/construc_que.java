package chapter7;

public class construc_que {
     construc_que(){
         this(5);
        System.out.println("A");

    }

    construc_que(int x){
        System.out.println("B");
    }
    public static void main(String[] args){
        construc_que c1 = new construc_que();
    }
}
