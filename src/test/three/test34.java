package test.three;

import java.util.Scanner;

//输入abc的值显示平方根
public class test34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double dd = (b * b) - (4 * a * c);
        if (dd < 0)
            System.out.println("方程无实根");
        else if (dd > 0) {
            double d = Math.sqrt(dd);
            double x1 = (-b + d) / (2 * a);
            double x2 = (-b - d) / (2 * a);
            System.out.println("方程有两个根" + "x1=" + x1 + ",x2=" + x2);
        } else {
            double d = Math.sqrt(dd);
            double x1 = (-b + d) / (2 * a);
            System.out.println("方程有一个根" + "x=" + x1);
        }
    }
}

