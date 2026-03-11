package Challenges.inheritance;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayOperation a = new ArrayOperation(new int[]{10,20});
        ArrayOperation.Statistics s = a.new Statistics();
        System.out.println(s.mean());
    }
}
