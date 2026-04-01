package chapter16;

import java.util.HashMap;
import java.util.Map;

public class TestingHashMap {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();
        map.put("Kailas",100);
        map.put("ram" , 200);
        System.out.println(map.size());
        System.out.println(map.get("ram"));
        System.out.println(map.containsKey("ram"));
    }
}
