package Challenges.ThreadQuestions;

public class ThreadStateMain {
    public static void main(String[] args) {
        Threadstate t1= new Threadstate();
        System.out.printf("Create the thread %s",t1.getState());
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
