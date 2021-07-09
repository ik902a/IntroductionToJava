package by.epam.basic.condition;

// Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class Condition3 {
    public static void main(String[] args) {
        double x1 = 1;
        double y1 = 1;
        double x2 = 2;
        double y2 = 2;
        double x3 = 3;
        double y3 = 3;

        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            System.out.println("Точки находятся на одной прямой");
        } else {
            System.out.println("Точки не находятся на одной прямой");
        }
    }
}
