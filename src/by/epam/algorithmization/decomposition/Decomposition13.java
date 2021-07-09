package by.epam.algorithmization.decomposition;

// Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
// Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
// Для решения задачи использовать декомпозицию.

public class Decomposition13 {
    public static void main(String[] args) {
        int n = 40;

        for (int i = n; i <= (2 * n - 2); i++) {
            if (simple(i) && simple(i + 2)) {
                System.out.println("Простые числа " + i + " и " + (i + 2) + " являются близнецами");
            }
        }
    }

    static boolean simple(int number) {
        boolean simple = true;

        for (int j = (number / 2); j > 1; j--) {
            if (number % j == 0) {
                simple = false;
                break;
            }
        }

        return simple;
    }
}
