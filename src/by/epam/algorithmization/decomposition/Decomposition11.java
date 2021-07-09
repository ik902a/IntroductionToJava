package by.epam.algorithmization.decomposition;

// Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Decomposition11 {
    static int n = 42;
    static int m = 61354;

    public static void main(String[] args) {
        if (numberOfPositions(n) > numberOfPositions(m)) {
            System.out.println("Цифр больше в числе " + n);
        } else {
            System.out.println("Цифр больше в числе " + m);
        }
    }

    static int numberOfPositions(int number) {
        int i = 0;
        while (number > 0) {
            number /= 10;
            i++;
        }
        return i;
    }
}
