package Challenges.ThreadQuestions;

import chapter17.multithreading.Runable.PrintTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingsinglethreadExecutar {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        PrintTask task1 = new PrintTask(('*'));
        service.submit(task1);
        service.submit(task1);
        service.submit(task1);
        service.shutdown();
    }
}
