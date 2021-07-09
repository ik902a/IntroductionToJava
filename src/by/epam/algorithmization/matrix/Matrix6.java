package by.epam.algorithmization.matrix;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Matrix6 {
    public static void main(String[] args) {
        int n = 8;
        int [][] m = new int [n][n];

        for (int i = 0; i < n; i++) {
            if (i < n / 2){
                for (int j = i; j < n - i; j++) {
                    m[i][j] = 1;
                }
            } else {
                for (int j = i; j >= n - i - 1; j--) {
                    m[i][j] = 1;
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
