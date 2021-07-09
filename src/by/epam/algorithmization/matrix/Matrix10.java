package by.epam.algorithmization.matrix;

// Найти положительные элементы главной диагонали квадратной матрицы.

public class Matrix10 {
    public static void main(String[] args) {
        int [][] m = {{5, 5, 15, 0, 4},
                      {6, 3, 4, 7, 2},
                      {4, 7, 3 ,2, 8},
                      {4, 3, 2, -8, 7},
                      {7, 5, 4, 8, 1}};

        for ( int i = 0; i < m.length; i++) {
            if (m[i][i] > 0) {
                System.out.println(m[i][i]);
            }
        }
    }
}
