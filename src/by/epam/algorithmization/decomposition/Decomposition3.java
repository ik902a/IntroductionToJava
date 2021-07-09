package by.epam.algorithmization.decomposition;

// Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

public class Decomposition3 {
    static double a = 3;

    public static void main(String[] args) {
        double areaOfHexagon = 0;

        for ( int i = 0; i < 6; i++) {
            areaOfHexagon += areaOfTriangle();
        }
        System.out.println(areaOfHexagon);
    }

    static double areaOfTriangle() {
        double area = (Math.pow(a, 2)* Math.sqrt(3)) / 4;
        return area;
    }
}
