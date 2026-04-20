package Challenges.ThreadQuestions;

import java.time.Duration;

public class Threadstate extends Thread{
    public void run()   {
        try {
            Thread.sleep(40000);
            System.out.printf("From insidde run %s",Thread.currentThread().getState());
        } catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        }
}
