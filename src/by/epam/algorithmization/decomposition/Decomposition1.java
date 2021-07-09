package by.epam.algorithmization.decomposition;

// Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел:

public class Decomposition1 {
    public static void main(String[] args) {
        int a = 13392;
        int b = 35712;
        int max;
        int min;

        if (a > b) {                             // Нахождение большего числа из данных
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        int commonFactor = division(max, min);
        int commonMultiple = (a * b) / commonFactor;
        System.out.println(commonFactor);
        System.out.println(commonMultiple);
    }

    static int division(int first, int second){          // нахождение НОД, алгоритм Эвклида
        int remainder = second;
        while (first % second != 0) {
            remainder = first % second;
            first = second;
            second = remainder;
        }
        return remainder;
    }
}
