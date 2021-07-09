package by.epam.algorithmization.matrix;

// В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.

import java.util.Scanner;

public class Matrix8 {
    public static void main(String[] args) {
        int [][] m = {{5, 5, 7, 0, 4},
                      {6, 3, 4, 7, 2},
                      {4, 7, 3 ,2, 8},
                      {4, 3, 2, 8, 7},
                      {7, 5, 4, 8, 1}};
        int c1;
        int c2;
        int elem;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер первого столбца (матрица порядка " + m.length + "): ");
        c1 = sc.nextInt();
        System.out.print("Введите номер второго столбца(матрица порядка " + m.length + "): ");
        c2 = sc.nextInt();

        for(int i = 0; i < m.length; i++){
            elem = m[i][c1 - 1];
            m[i][c1 - 1] = m[i][c2 - 1];
            m[i][c2 - 1] = elem;
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
