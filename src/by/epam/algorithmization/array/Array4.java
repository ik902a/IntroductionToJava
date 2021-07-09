package by.epam.algorithmization.array;

// Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class Array4 {
    public static void main(String[] args) {
        double [] a = {2, 5, 56, 42, 15};
        double max = a[0];
        double min = a[0];
        int nmax = 0;
        int nmin = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                nmax = i;
            }
            if (a[i] < min) {
                min = a[i];
                nmin = i;
            }
        }
        a[nmax] = min;
        a[nmin] = max;

        for (double elem : a) {
            System.out.print(elem + " ");
        }
    }
}
