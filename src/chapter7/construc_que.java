package chapter7;

public class construc_que {
     construc_que(){

        System.out.println("A");

    }

    construc_que(int x){
         this();
        System.out.println("B");
    }
    public static void main(String[] args){

         construc_que c1 = new construc_que(5);
    }
}
