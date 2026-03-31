package chapter16;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList();
        queue.add(10);
        queue.offer(20);


        queue.remove(10);
        System.out.println(queue.peek());
        System.out.println(queue);
//        for(Integer i : queue){
//            System.out.println(i);
//        }
    }
}
