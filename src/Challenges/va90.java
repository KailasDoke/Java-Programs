package Challenges;

import java.util.Arrays;
import java.util.*;
public class va90 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bear","zebra","Lion","Ant");
        System.out.println(list);
        sorInDecendin(list);
        System.out.println(list);
    }
    public static void sorInDecendin(List<String> stringList){

        Collections.sort(stringList);
    }
}
