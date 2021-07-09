package by.epam.algorithmization.matrix;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Matrix4 {
    public static void main(String[] args) {
        int n = 8;
        int [][] m = new int [n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 0) {
                    m[i][j - 1] = j;
                } else {
                    m[i][n-j] = j;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
