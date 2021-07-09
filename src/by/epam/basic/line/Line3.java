package by.epam.basic.line;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// (𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦)/(𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦)∗𝑡𝑔 𝑥𝑦

import static java.lang.Math.*;

public class Line3 {
    public static void main(String[] args) {
        double z;
        double x = 2;
        double y = 1;

        z = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);
        System.out.println(z);
    }
}
