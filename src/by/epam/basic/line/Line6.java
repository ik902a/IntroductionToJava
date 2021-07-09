package by.epam.basic.line;

// Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
// принадлежит закрашенной области, и false — в противном случае:

public class Line6 {
    public static void main(String[] args) {
        double x = -3.5;
        double y = -1.2;

        System.out.println(x >= -2 && x <= 2 && y >= 0 && y <= 4 || x >= -4 && x <= 4 && y >= -3 && y <= 0);
    }
}
