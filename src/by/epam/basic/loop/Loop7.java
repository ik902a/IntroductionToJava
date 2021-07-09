package by.epam.basic.loop;

// Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
// m и n вводятся с клавиатуры.

import java.util.Scanner;

public class Loop7 {
    public static void main(String[] args) {
        int m;
        int n;
        boolean logic;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число m: ");
        m = sc.nextInt();
        System.out.print("Введите число n: ");
        n = sc.nextInt();

        for (int i = m; i <= n; i++) {
            logic = true;
            System.out.print("Делители для числа " +  i + ": ");
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    System.out.print(j + ", ");
                    logic = false;
                }
            }
            if (logic) {
                System.out.print("-  ");
            }
            System.out.println("\b\b");
        }
    }
}
