package by.epam.algorithmization.decomposition;

// Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Decomposition7 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 15; i++) {
            if ( i % 2 != 0) {
                sum += factorial(i);
             }
        }

        System.out.println("Сумма равна " + sum);
    }

    static int factorial(int elem) {
        int factorial = 1;

        for(int i = 2; i <= elem; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
