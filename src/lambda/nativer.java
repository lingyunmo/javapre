package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class nativer {
    public static void main(String[] args) {
        Stu[] stu = new Stu[]{
                new Stu(1, "张三", 18),
                new Stu(4, "赵六", 21),
                new Stu(5, "田七", 22)
        };
        Arrays.sort(stu, Comparator.comparingInt(Stu::getAge));
        Arrays.sort(stu, Comparator.comparingInt(Stu::getId));
        Arrays.sort(stu, Comparator.comparing(Stu::getName));
        for (Stu stu1 : stu) {
            System.out.println(stu1);
        }
    }
}
