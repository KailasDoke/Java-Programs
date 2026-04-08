package join;

public class TestJoin {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        TestJoin counter = new TestJoin();

        SynchronizeThread t1 = new SynchronizeThread(counter);
        SynchronizeThread t2 = new SynchronizeThread(counter);

        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}

class SynchronizeThread extends Thread {
    private TestJoin counter;

    public SynchronizeThread(TestJoin counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}