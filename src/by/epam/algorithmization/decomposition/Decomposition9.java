package by.epam.algorithmization.decomposition;

// Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
// если угол между сторонами длиной X и Y— прямой.

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Decomposition9 {
    static double x = 5;
    static double y = 5;
    static double z = 5;
    static double t = 5;
    static boolean kindOfQuadrilateral = true; // True - четырехугольник выпуклый; False - вогнутый(диагонали
                                               // 4хугольника не пересекаются);

    public static void main(String[] args) {
        double area;

        if (kindOfQuadrilateral) {
            area = rightTriangleArea() + triangleArea();
        } else {
            if ((x + y) > (z + t)) {                          // Проверка в какую сторону выгнут четырехугольник
                area = rightTriangleArea() - triangleArea();
            } else {
                area = triangleArea() - rightTriangleArea();
            }
        }
        System.out.println("Площадь четырех угольника " + area);
    }

    static double hypotenuse() {  // Диагональ четырехугольника противолежащая прямому углу
        return sqrt(pow(x, 2) + pow(y, 2));
    }

    static double semiPerimeter() {
        return (z + t + hypotenuse()) / 2 ;
    }

    static double rightTriangleArea() {
        return (x * y) / 2;
    }

    static double triangleArea() {
        double p = semiPerimeter();
        return sqrt(p * (p - z) * (p - t) * (p - hypotenuse()));
    }
}
