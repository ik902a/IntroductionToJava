package by.epam.basic.loop;

// Найти сумму квадратов первых ста чисел.

import static java.lang.Math.pow;

public class Loop3 {
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += pow(i, 2);
        }
        System.out.println(sum);
    }
}
