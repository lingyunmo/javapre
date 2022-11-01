package test.three;
import java.util.Scanner;
//输入一个年份判断是否为闰年
public class test32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println("闰年");
        } else {
            System.out.println("平年");
        }
    }
}
