package test.five;

import java.util.Scanner;

public class test51 {
    public static void main(String[] args) {
        int[] a = new int[5];
        double sum = 0;
        int max = 0;
        int min = 0;
        double avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入五个数据");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
            if (i == 0) {
                max = a[i];
                min = a[i];
            } else {
                if (a[i] > max) {
                    max = a[i];
                }
                if (a[i] < min) {
                    min = a[i];
                }
            }
        }
        avg = sum / a.length;
        System.out.println("和为" + sum);
        System.out.println("最大值为" + max);
        System.out.println("最小值为" + min);
        System.out.println("平均值为" + avg);
    }
}
