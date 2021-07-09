package by.epam.basic.loop;

// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Loop8 {
    public static void main(String[] args) {
        double a = -42.872;
        double b = 666;
        int m;
        int n;
        int num;

        System.out.print("Число " + a + " состоит из следующих цифр: ");
        if (a < 0) {
            a *= -1;
        }
        while (a % 10 >= 0.01) {  // Достаточая точночть для числа double
            a *= 10;
        }
        m = (int) a / 10;
        while (m != 0) {
            num = m % 10;
            m = m / 10;
            System.out.print(num + ", ");
        }
        System.out.println("\b\b");

        if (b < 0) {
            b *= -1;
        }
        System.out.print("Число " + b + " состоит из следующих цифр: ");
        while (b % 10 >= 0.01) {
            b *= 10;
        }
        n = (int) b / 10;
        while (n != 0) {
            num = n % 10;
            n = n / 10;
            System.out.print(num + ", ");
        }
        System.out.println("\b\b");
    }
}
