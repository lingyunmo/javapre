package TreeSet;

import java.util.TreeSet;

public class test {
    public static void main(String[] args) {
        TreeSet<Integer> set= new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            set.add((int) (Math.random() * 90 + 10));
        }
    }
}
