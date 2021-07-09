package by.epam.algorithmization.decomposition;

// Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
// Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

public class Decomposition16 {
    public static void main(String[] args) {
        int n = 4;
        int start = firstNumber(n);

        int sum = 0;
        for (int i = start; i < Math.pow(10, n); i += 2) {
            if (oddNumber(i)) {
                sum += i;
            }
        }

        System.out.println(sum);
        System.out.println(evenNumeral(sum) + " четная(ые) цифра(ы) в сумме");
    }

    static int firstNumber(int n) {        // Первое n-значное число
        int number = 0;
        for (int i = 1; i <= n; i++) {
            number = number * 10 + 1;
        }

        return number;
    }

    static boolean oddNumber(int number) {  // Находим числа, состоящие только из нечетных цифр
        int box;

        while (number > 0) {
            box = number % 10;

            if (box % 2 == 0) {
                return false;
            } else {
                number /= 10;
            }
        }

        return true;
    }

    static int evenNumeral (int number) {   // Находим количество четных цифр в ответе
        int check = 0;
        int box;

        while (number > 0) {
            box = number % 10;
            if (box % 2 == 0) {
                check++;
            }
            number /= 10;
        }

        return check;
    }
}
