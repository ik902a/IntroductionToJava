package by.epam.basic.condition;

// Вычислить значение функции:

import static java.lang.Math.pow;

public class Condition5 {
    public static void main(String[] args) {
        double f;
        double x = 42;

        if (x <= 3){
            f = pow(x, 2) - 3 * x + 9;
        } else {
            f = 1 / (pow(x, 3) + 6);
        }
        System.out.println(f);
    }
}
