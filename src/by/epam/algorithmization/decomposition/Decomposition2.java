package by.epam.algorithmization.decomposition;

// Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Decomposition2 {
    static int [] a = {42, 48, 18, 153};

    public static void main(String[] args) {
        System.out.println(commonFactor());
    }

    static int commonFactor() {
        int devisor = min();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % devisor != 0) {
                devisor--;
                i = -1;
            }
        }
        return devisor;
    }

    static int min() {
        int min = a[0];
        for (int elem : a) {
            if (elem < min) {
                min = elem;
            }
        }
        return min;
    }
}
