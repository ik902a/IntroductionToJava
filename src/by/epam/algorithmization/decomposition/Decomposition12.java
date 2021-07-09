package by.epam.algorithmization.decomposition;

// Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются числа,
// сумма цифр которых равна К и которые не большее N.

public class Decomposition12 {
    static int k = 7;
    static int n = 120;

    public static void main(String[] args) {
        int size = 0;
        for (int i = k; i <= n; i++) {
            if (sum(i) == k) {
                size++;
            }
        }

        int [] array = new int [size];
        int j = 0;
        for (int i = k; i <= n; i++) {
            if (sum(i) == k) {
                array[j] = i;
                j++;
            }
        }

        for (int elem : array) {
            System.out.print(elem + " ");
        }
    }

    static int sum(int elem) {
        int sum = 0;
        while (elem > 0) {
            sum += elem % 10;
            elem /= 10;
        }
        return sum;
    }
}

