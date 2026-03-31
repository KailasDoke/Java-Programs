package chapter16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(5);
        num.add(10);
        Collections.sort(num);
        Collections.reverse(num);
        System.out.println("Maximum number in List "+ Collections.max(num));
        for (Integer i: num) {
            System.out.println(i);
        }
    }
}
