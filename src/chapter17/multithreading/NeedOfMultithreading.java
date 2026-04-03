package chapter17.multithreading;

public class NeedOfMultithreading {

    public static void main(String[] args) {
        long current = System.currentTimeMillis();

        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();
        System.out.println("Strating first thread");
        t1.start();
        System.out.println("Strating Second thread");
        t2.start();
        System.out.println("Strating Third thread ");
        t3.start();


        long end = System.currentTimeMillis();

        System.out.printf("\n %s Total time required to complite task ",Thread.currentThread().getName() , (end-current));
    }


}
