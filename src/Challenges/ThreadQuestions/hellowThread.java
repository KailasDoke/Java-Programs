package Challenges.ThreadQuestions;

public class hellowThread extends Thread{
    private final int threadNumber;

    public hellowThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.printf("(%d)  Hellow from thread %d\n",i,threadNumber);
        }
    }
}
