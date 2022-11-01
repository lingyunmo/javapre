package test.five;

public class test55 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("排序前：");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int i1 = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    i1 = j;
                }
            }
            if (i1 != i) {
                arr[i1] = arr[i];
                arr[i] = min;
            }
        }
        System.out.println("排序后：");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
