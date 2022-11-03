package Exception;

public class test3 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        while (true) {
            try {
                System.out.println("请输入数组下标：");
                int index = new java.util.Scanner(System.in).nextInt();
                System.out.println("对应元素值为：" + arr[index]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("下标越界，请重新输入");
            }
        }
    }
}
