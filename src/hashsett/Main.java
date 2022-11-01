package hashsett;

import java.util.Arrays;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Employee> set = new TreeSet<>();
        set.add(new Employee(10431, "张三", 23, 6000.76));
        set.add(new Employee(10653, "李四", 24, 6563.12));
        set.add(new Employee(10063, "王五", 24, 5446.34));
        set.add(new Employee(10098, "赵六", 22, 9123.47));
        Arrays.sort(set.toArray());
        for (Employee employee : set) {
            System.out.println(employee);
        }
    }
}
