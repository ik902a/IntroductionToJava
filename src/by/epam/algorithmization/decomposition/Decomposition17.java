package by.epam.algorithmization.decomposition;

// Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
// Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

public class Decomposition17 {
    public static void main(String[] args) {
        int number = 420;
        int check = 0;

        while (number > 0) {
            number -= numeralSum(number);
            check++;
        }

        System.out.println(check);
    }

    static int numeralSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
            }
        return sum;
    }
}
