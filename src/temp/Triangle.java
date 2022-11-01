package temp;

public class Triangle {
    public static void main(String[] args) {
        int[][] triangle = new int[10][];
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];
            for (int k = 10; k > triangle[i].length; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < triangle[i].length; j++) {
                if (j == 0 || j == triangle[i].length - 1) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}