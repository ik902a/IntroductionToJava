package by.epam.algorithmization.matrix;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Matrix5 {
        public static void main(String[] args) {
            int n = 8;
            int [][] m = new int [n][n];

            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= n - i; j++) {
                    m[i - 1][j] = i;
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
