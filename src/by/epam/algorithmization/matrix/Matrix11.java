package by.epam.algorithmization.matrix;

// Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.

public class Matrix11 {
    public static void main(String[] args) {
        int [][] m = new int[10][20];

        for (int i = 0; i < m.length; i++) {          // Создаем матрицу из случайных чисел
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) (Math.random() * 15);
            }
        }

        for (int i = 0; i < m.length; i++) {           // Выводим созданную матрицу в консоль
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < m.length; i++) {
            int chek = 0;
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 5) {
                    chek++;
                }
            }
            if (chek >= 3){
                System.out.println("В строке №" + (i + 1) + " число 5 встречается 3 и болеее раз");
            }
        }
    }
}
