package by.epam.basic.line;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑏+√(𝑏2+4𝑎𝑐)/2𝑎−𝑎3𝑐+𝑏−2

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Line2 {
    public static void main(String[] args) {
        double z;
        double a = 2;
        double b = 4;
        double c = 42;

        z = (b + sqrt(pow(b, 2) +4 * a * c)) / (2 * a) - pow(a, 3) + pow(b, -2);
        System.out.println(z);
    }
}
