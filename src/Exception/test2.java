package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int a, b;
        while (true) {
            try {
                System.out.println("请输入两个整数：");
                a = new Scanner(System.in).nextInt();
                b = new Scanner(System.in).nextInt();
                System.out.println("和为：" + (a + b));
                break;
            } catch (InputMismatchException e) {
                System.out.println("输入的不是整数，请重新输入");
            }
        }
    }
}
