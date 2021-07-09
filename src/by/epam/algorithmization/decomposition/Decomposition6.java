package by.epam.algorithmization.decomposition;

// Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class Decomposition6 {
    static int a = 6;
    static int b = 15;
    static int c = 42;

    public static void main(String[] args) {
        int [] array = {a, b, c};
        int min = array[0];

        for (int elem : array) {
            if (elem < min) {
                min = elem;
            }
        }

        int divisor = simple(min);
        if (divisor == 1) {
            System.out.println("Числа взаимно простые");
        } else {
            System.out.println("НОД чисел равен " + divisor);
        }
    }

    static int simple(int divisor){
        while (divisor > 1) {
            if (a % divisor == 0 && b % divisor == 0 && c % divisor == 0) {
                break;
            }
            divisor--;
        }
        return divisor;
    }
}
