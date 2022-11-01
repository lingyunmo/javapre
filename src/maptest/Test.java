package maptest;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "tom");
        map.put(103, "tom");
        map.put(104, "mike");
        System.out.println(map);
        //遍历map1
        for (Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
        //遍历map2
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
        //遍历map3
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + map.get(key));
        }
        //遍历map4
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println(key + " " + map.get(key));
        }
        //遍历map5
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry<Integer, String> entry : set) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        //遍历map6
        Set<Map.Entry<Integer, String>> set1 = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator1 = set1.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Integer, String> entry = iterator1.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
