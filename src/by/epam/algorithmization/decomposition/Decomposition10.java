package by.epam.algorithmization.decomposition;

// Дано натуральное число N. Написать метод(методы) для формирования массива,
// элементами которого являются цифры числа N.

public class Decomposition10 {
    static int n = 57780042;

    public static void main(String[] args) {
        int [] a = new int[numberOfPositions()];

        for (int i = a.length - 1; i >= 0; i--) {
            a[i] = numeral(n);
            n /= 10;
        }

        for (int elem : a) {
            System.out.print(elem + " ");
        }
    }

    static int numberOfPositions() {
        int i = 0;
        int number = n;

        while (number > 0) {
            number /= 10;
            i++;
        }

        return i;
    }

    static int numeral(int number) {
        return number % 10;
    }
}
