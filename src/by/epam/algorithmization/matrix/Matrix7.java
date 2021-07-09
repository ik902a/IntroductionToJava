package by.epam.algorithmization.matrix;

// Сформировать квадратную матрицу порядка N по правилу:
// A[I, J] = sin((I^2 -J^2)/N)
// и подсчитать количество положительных элементов в ней.

import static java.lang.Math.pow;
import static java.lang.Math.sin;

public class Matrix7 {
    public static void main(String[] args) {
        int n = 8;
        double [][] m = new double [n][n];
        int num = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sin((pow(i, 2) - pow(j, 2)) / n);
                if (m[i][j] > 0){
                    num++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%.3f ", m[i][j]);
            }
            System.out.println();
        }
        System.out.println("Количество положительных элементов: " + num);
    }
}
