package maptest;

import java.util.*;

public class test2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        String str = "Good morning. Have a good class. Have a good visit. Have fun!";
        str = str.toLowerCase();
        String[] words = str.split("[ .!?]+");
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for (String key : list) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
