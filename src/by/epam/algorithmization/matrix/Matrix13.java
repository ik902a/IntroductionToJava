package by.epam.algorithmization.matrix;

// Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

public class Matrix13 {
    public static void main(String[] args) {
        int[][] m = {{5, 5, 15, 0, 4},
                     {6, 3, 4, 7, 2},
                     {4, 7, 3, 2, 8},
                     {4, 3, 2, -8, 7},
                     {7, 5, 4, 8, 1}};
        int elem;

        for (int n = 0; n < m.length - 1; n++) {
            for (int i = 0; i < m.length - 1; i++) {
                for (int k = 0; k < m[i].length - 1; k++) {
                    for (int j = 0; j < m[i].length; j++) {
                        if (m[i][j] > m[i + 1][j]) {
                            elem = m[i][j];
                            m[i][j] = m[i + 1][j];
                            m[i + 1][j] = elem;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}

