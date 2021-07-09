package by.epam.algorithmization.matrix;

// Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Matrix15 {
    public static void main(String[] args) {
        int [][] m = {{5, 5, 15, 0, 4},
                      {6, 3, 4, 7, 2},
                      {4, 7, 3 ,2, 8},
                      {4, 3, 2, -8, 7},
                      {7, 5, 4, 8, 1}};
        int max = m[0][0];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (max < m[i][j]) {
                    max = m[i][j];
                }
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] % 2 == 0) {
                    System.out.print(m[i][j] + " ");
                } else {
                    System.out.print(max + " ");
                }
            }
            System.out.println();
        }
    }
}
