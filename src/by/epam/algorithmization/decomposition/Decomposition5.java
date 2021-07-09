package by.epam.algorithmization.decomposition;

// Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
// которое меньше максимального элемента массива, но больше всех других элементов).

public class Decomposition5 {
    static int [] a = {6, 42, 7, -7, 18, 15, 13, 3};

    public static void main(String[] args) {

        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            max = max(a[i], max);
        }

        int secondMax = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] != max) {
                secondMax = max(a[i], secondMax);
            }
        }

        System.out.println("Второе по величине число: " + secondMax);
    }

    static int max(int x, int max) {
        if (x > max) {
            return x;
        }
        return max;
    }
}
