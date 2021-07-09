package by.epam.algorithmization.decomposition;

// Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
// возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
// Для решения задачи использовать декомпозицию.

public class Decomposition14 {
    public static void main(String[] args) {
        int k = 4200;

        for (int i = 1; i <= k; i++) {
            if (armstrongNumber(i) == i) {
                System.out.println(i);
            }
        }
    }

    static double armstrongNumber(int number) {
        int sum = 0;
        int degree = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
            degree++;
        }

        return Math.pow(sum, degree);
    }

//    static int degree(int number) {   // Другой вариант самовлюбленного числа
//        int degree = 0;
//        while (number > 0) {
//            number /= 10;
//            degree++;
//        }
//        return degree;
//    }
//
//    static int armstrongNumber(int number) {
//        int sum = 0;
//        int i = degree(number);
//        while (number > 0) {
//            sum += Math.pow((number % 10), i);
//            number /= 10;
//        }
//        return sum;
//    }
}
