package by.epam.algorithmization.matrix;

// Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.

public class Matrix14 {
    public static void main(String[] args) {
        int m = (int) (Math.random() * 10);
        int n = (int) (Math.random() * 10);
        int a[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for ( int j = 0; j < n; j++) {
                if (i <= j) {
                    a[i][j] = 1;
                } else{
                    a[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
