package test.five;

public class test515 {
    public static void print(int[][] arr) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = {{1, 3, 5}, {-3, 6, 0}, {13, -5, 7}, {-2, 19, 25}};
        int[][] b = {{0, -1, -2}, {7, -1, 6}, {-6, 13, 2}, {12, -8, -13}};
        int[][] c = new int[4][3];
        int[][] d = new int[4][3];
        int[][] e = new int[3][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                d[i][j] = a[i][j] - b[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                e[i][j] = a[j][i];
            }
        }
        System.out.println("两个矩阵的和为：");
        print(c);
        System.out.println("两个矩阵的差为：");
        print(d);
        System.out.println("a的转置");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(e[i][j] + " ");
            }
            System.out.println();
        }
    }
}
