package maptest;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class test1 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字，以0结束");
        int num;
        while (true) {
            num = scanner.nextInt();
            if (num == 0)
                break;
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        Set<Integer> keySet = map.keySet();
        int max = 0;
        for (Integer key : keySet) {
            if (map.get(key) > max) {
                max = map.get(key);
            }
        }
        for (Integer key : keySet) {
            if (map.get(key) == max) {
                System.out.println("出现次数最多的数字是：" + key + "，出现了" + max + "次");
            }
        }
    }
}
