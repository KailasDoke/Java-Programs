package Challenges.ThreadQuestions;

public class Main {
    public static void main(String[] args) {
        hellowThread h1 = new hellowThread(1);
        hellowThread h2 = new hellowThread(2);

        h1.start();
        h2.start();
    }
}
