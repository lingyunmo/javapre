package arraylisttest;

import java.util.ArrayList;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个以0结尾的数值序列：");
        int num = input.nextInt();
        while (num != 0) {
            list.add(num);
            num = input.nextInt();
        }
        System.out.println("输入的数值序列为：" + list);
        int max = max(list);
        System.out.println("最大值为：" + max);

    }

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
}