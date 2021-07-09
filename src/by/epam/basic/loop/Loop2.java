package by.epam.basic.loop;

// Вычислить значения функции на отрезке [а,b] c шагом h:

public class Loop2 {
    public static void main(String[] args) {
        double a = -12;
        double b = 42;
        double h = 1;
        double y;

        for (double x = a; x <= b; x +=h) {
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }
            System.out.println(y);
        }
    }
}
