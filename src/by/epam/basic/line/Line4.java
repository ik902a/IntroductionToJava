package by.epam.basic.line;

// Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.

import static java.lang.Math.round;

public class Line4 {
    public static void main(String[] args) {
        double r = 777.999;
        double x;
        double y;
        double n;

        x = r % 1;
        y = r - x;
        n = round(x * 1000) + (y / 1000);
        System.out.println(n);
    }
}
