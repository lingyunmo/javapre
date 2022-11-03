package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        try {
            System.out.println("请输入圆的半径：");
            double r = new Scanner(System.in).nextDouble();
            System.out.println("圆的面积为：" + r * r * Math.PI);
        } catch (InputMismatchException e) {
            System.out.println("输入的不是数字");
        }
    }
}
