package by.epam.algorithmization.decomposition;

// Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
// (например, 1234, 5789). Для решения задачи использовать декомпозицию.

public class Decomposition15 {
    public static void main(String[] args) {
        for (int k = 1; k <= 9; k++) {
            for (int i = 1; i <= 10 - k; i++) {
                System.out.println(number(i, k));
            }
        }
    }

    static int number(int number, int k) {
        int elem = number;

        for (int i = 1; i < k; i++) {
            elem++;
            number = number * 10 + elem;
        }

        return number;
    }
}
