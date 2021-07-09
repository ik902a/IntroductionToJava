package by.epam.basic.condition;

// Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да,
// то будет ли он прямоугольным.

import javax.xml.parsers.DocumentBuilder;
import java.math.BigDecimal;

public class Condition1 {
    public static void main(String[] args) {
        double a = 42;
        double b = 90;

        if (a + b < 180 && a > 0 && b > 0) {
            System.out.print("Треугольник существует");
            if (a == 90 || b == 90) {
                System.out.println(" и он простой");
            }
        } else {
            System.out.println("Треугольник не существует");
        }

        int t[] = new int[8];
        t[0] = 6;
        int[][] g = new int[6][8];
        g[4][6] = 8;
        System.out.println(g[4][6]);



        Integer i1 = 128;
        Integer i2 = 128;
        System.out.print(i1 == i2);
        Integer i3 = 127;
        Integer i4 = 127;
        System.out.println(i3 == i4);




    }
}
