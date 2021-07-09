package by.epam.with_classes.simple;

// Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади,
// периметра и точки пересечения медиан.

import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;


public class Triangle {
    double[] a;
    double[] b;
    double[] c;

    public Triangle(double[] a, double[] b, double[] c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(new double[] {-3, -3}, new double[] {3, 3}, new double[] {4, -1});
        System.out.println("Площадь треугольника - " + triangle.area());
        System.out.println("Периметр треугольника - " + triangle.perimeter());
        System.out.println("Координата пересечения медиан " + triangle.median());
    }

    public double sideLength (double[] x, double[] y) {
        return (sqrt(pow((y[0] - x[0]), 2) + pow((y[1] - x[1]), 2)));
    }

    public double perimeter() {
        return (sideLength(a, b) + sideLength(b, c) + sideLength(c, a));
    }
    public double area() {
        return (sqrt((perimeter() / 2) *(perimeter() / 2 - sideLength(a, b))
                * (perimeter() / 2 - sideLength(b, c))
                * (perimeter() / 2 - sideLength(c, a))));
    }

    public String median () {
        double[] n = {(a[0] + b[0]) / 2, (a[1] + b[1]) / 2};
        double[] o = {(2 * n[0] + c[0]) / 3, (2 * n[1] + c[1]) / 3};
        return ("О(" + o[0] + ", " + o[1] + ")");
    }
}
