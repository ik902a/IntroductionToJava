package by.epam.basic.condition;

// Найти max{min(a, b), min(c, d)}.

public class Condition2 {
    public static void main(String[] args) {
        int a = 30;
        int b = 50;
        int c = 42;
        int d = 92;
        int min1;
        int min2;
        int max;

        if (a < b) {
            min1 = a;
        } else {
            min1 = b;
        }
        if (c < d) {
            min2 = c;
        } else {
            min2 = d;
        }
        if (min1 > min2) {
            max = min1;
        } else {
            max = min2;
        }
        System.out.println(max);
    }
}
