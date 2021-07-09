package by.epam.algorithmization.decomposition;

// Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива
// с номерами от k до m.

public class Decomposition8 {
    static int [] d = {3, 6, -4, 3, -7, 6, -4, 5, 45, 92, 35, 72};
    static int k = 2;
    static int m = 5;

    public static void main(String[] args) {
        for (int i = k - 1; i <= m - 1; i++) {
            System.out.println("Суммы " + sum(i));
        }
    }

    static int sum(int elem) {
        int sum = 0;
        for (int i = elem; i < elem + 3; i++) {
            sum += d[i];
        }
        return sum;
    }
}
