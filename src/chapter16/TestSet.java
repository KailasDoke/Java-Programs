package chapter16;

import java.util.HashSet;
import java.util.Set;


public class TestSet {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<>();
        set.add("Apple");
        set.add(10);
        set.add(10);
        System.out.println(set.size());
        boolean contains = set.contains(10);
        System.out.println(contains);
        for(Object item : set ){
            System.out.println(item);
        }

    }
}
