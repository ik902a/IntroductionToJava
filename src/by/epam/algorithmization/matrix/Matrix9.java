package by.epam.algorithmization.matrix;

// Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.

public class Matrix9 {
    public static void main(String[] args) {
        int [][] m = {{5, 5, 15, 0, 4},
                      {6, 3, 4, 7, 2},
                      {42, 7, 3 , 4, 8},
                      {4, 3, 2, 8, 7},
                      {7, 5, 4, 8, 1}};
        int [] sum = new int[m.length];
        int max = m[0][0];
        int num = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sum[j] += m[i][j];
                if (sum[j] > max) {
                    max = sum[j];
                    num = j + 1;
                }
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "  ");
            }
            System.out.println();
        }
        for (int i = 0; i < m.length; i++) {
            System.out.print(sum[i] + " ");
        }
        System.out.println("\n" + "Максимальная сумма в столбце №" + num);
    }
}
