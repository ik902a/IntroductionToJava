package by.epam.algorithmization.matrix;

// Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Matrix3 {
    public static void main(String[] args) {
        int [][] m = {{5, 5, 7, 0, 4},
                      {6, 3, 4, 7, 2},
                      {4, 7, 3 ,2, 8},
                      {4, 3, 2, 8, 7},
                      {7, 5, 4, 8, 1}};
        int k = 2;
        int p = 4;

        for (int i = 0; i < m[k - 1].length; i++) {
            System.out.print(m[k - 1][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i][p - 1] + " ");
        }
    }
}
