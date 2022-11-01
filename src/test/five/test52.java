package test.five;

public class test52 {
    public static void main(String[] args) {
        int[] a = new int[1000];
        int[] b = new int[6];
        for (int i = 0; i < 1000; i++) {
            a[i] = (int) (Math.random() * 6 + 1);
        }
        for (int i = 0; i < 1000; i++) {
            switch (a[i]) {
                case 1:
                    b[0]++;
                    break;
                case 2:
                    b[1]++;
                    break;
                case 3:
                    b[2]++;
                    break;
                case 4:
                    b[3]++;
                    break;
                case 5:
                    b[4]++;
                    break;
                case 6:
                    b[5]++;
                    break;
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("数字" + (i + 1) + "出现了" + b[i] + "次");
        }
    }
}
