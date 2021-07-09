package by.epam.algorithmization.matrix;

// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Matrix1 {
    public static void main(String[] args) {
        int [][] m = {{5, 5, 7, 0, 4},
                      {6, 3, 4, 7, 2},
                      {4, 7, 3 ,2, 8},
                      {4, 3, 2, 8, 7},
                      {7, 5, 4, 8, 1}};

        for (int i = 0; i < m.length; i++) {
            if ((i + 1) % 2 != 0 && m[i][0] > m[i][m[i].length - 1]) {
                for (int j = 0; j < m[i].length; j++) {
                    System.out.print(m[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
