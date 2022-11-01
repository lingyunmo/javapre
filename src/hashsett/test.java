package hashsett;

import java.util.HashSet;
import java.util.TreeSet;

public class test {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        TreeSet<Integer> set1 = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 90 + 10);
            set.add(num);
            set1.add(num);
        }
        System.out.println("HashSet输出" + set);
        System.out.println("TreeSet输出" + set1);
    }
}
