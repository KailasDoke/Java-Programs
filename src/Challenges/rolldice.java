package Challenges;

public class rolldice {
     int roll(){
         double random = Math.random()*6;
         return (int) Math.ceil(random);
     }

    public static void main(String[] args) {
        rolldice dice = new rolldice();
        for (int i = 1; i <= 10; i++) {
            System.out.println(dice.roll());
        }
    }

}
