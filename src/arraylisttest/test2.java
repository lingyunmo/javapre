package arraylisttest;

import java.util.ArrayList;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        System.out.println("请输入5个数字：");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }
        System.out.println("输入的数字为：" + list);
        double sum = sum(list);
        System.out.println("和为：" + sum);
    }

    public static double sum(ArrayList<Double> list) {
        if (list == null || list.size() == 0) {
            return 0;
        }
        double sum = 0;
        for (Double a : list) {
            sum += a;
        }
        return sum;
    }
}