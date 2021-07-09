package by.epam.algorithmization.matrix;

// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Matrix2 {
    public static void main(String[] args) {
        int [][] m = {{5, 5, 7, 0, 4},
                      {6, 3, 4, 7, 2},
                      {4, 7, 3 ,2, 8},
                      {4, 3, 2, 8, 7},
                      {7, 5, 4, 8, 1}};

        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i][i] + " ");
        }
    }
}
