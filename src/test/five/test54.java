package test.five;

public class test54 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("对换元素前：");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("对换元素后：");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
