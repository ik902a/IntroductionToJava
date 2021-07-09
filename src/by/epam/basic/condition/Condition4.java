package by.epam.basic.condition;

//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.

public class Condition4 {
    public static void main(String[] args) {
        int a = 11;
        int b = 17;
        int x = 9;
        int y = 14;
        int z = 42;

        if (x < a && y < b || x < b && y < a || x < a && z < a || x < b && z < a || y < a && z < b || y < b && z < a) {
            System.out.println("Кирпич пройдет в отвестие");
        } else {
            System.out.println("Кирпич не пройдет в отвестие");
        }
    }
}
