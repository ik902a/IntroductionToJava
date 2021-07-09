package by.epam.basic.loop;

// Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
// заданному е. Общий член ряда имеет вид:
// An = 1/2n + 1/3n

import static java.lang.Math.pow;

public class Loop5 {
    public static void main(String[] args) {
        double a;
        double e = 0.5;
        double sum = 0;

        for (int i = 0; i < 10; i++) {
            a = 1/pow(2, i) + 1/pow(3, i);
            if (a >= 0 && a >= e || a <= 0 && a <= (-1 * e)) {
                sum += a;
            }
        }
        System.out.println(sum);
    }
}
