package by.epam.basic.loop;

// Составить программу нахождения произведения квадратов первых двухсот чисел.

import static java.lang.Math.pow;

public class Loop4 {
    public static void main(String[] args) {
        long com = 1L;

        for (int i = 1; i <= 200; i++) {
            com *= pow(i, 2);
        }
        System.out.println(com);
    }
}
