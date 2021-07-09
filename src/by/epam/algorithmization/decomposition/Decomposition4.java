package by.epam.algorithmization.decomposition;

// На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие,
// между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.

public class Decomposition4 {
    static int [] x = {3, 6, -4, 3, -7, 6, -4};
    static int [] y = {-5, 4, 7, -5, 2, -4, -7};

    public static void main(String[] args) {
        double maxDistance = 0;
        int point1 = 0;
        int point2 = 1;

        for (int i = 0; i < x.length - 2; i++) {        // Находим значение максимального расстояния
            for (int j = i + 1; j < x.length; j++) {
                double distance = distance(i, j);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    point1 = i;
                    point2 = j;
                }
            }
        }

        System.out.print("Самое болшое расстояние между точками [");
        System.out.println(x[point1] + "; " + y[point1] + "] и [" + x[point2] + "; " + y[point2] + "]");

        for (int i = point1 + 1; i < x.length - 2; i++) {  // Проверим есть ли такое же расстояние между другими точками
            for (int j = i + 1; j < x.length; j++) {
                double distance = distance(i, j);
                if (distance == maxDistance) {
                    System.out.print("Самое болшое расстояние между точками [");
                    System.out.println(x[i] + "; " + y[i] + "] и [" + x[j] + "; " + y[j] + "]");
                }
            }
        }
    }

    static double distance(int first, int second) {
        double d;
        d = Math.sqrt(Math.pow(x[first] - x[second], 2) + Math.pow(y[first] - y[second], 2));
        return d;
    }
}
