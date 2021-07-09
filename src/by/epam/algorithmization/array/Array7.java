package by.epam.algorithmization.array;

// Даны действительные числа A1, A2, ..., An. Найти
//max( A1+A2n, A2+A2n-1, ..., An+An+1).

public class Array7 {
    public static void main(String[] args) {
        double [] a = {2, 5, 7, -3, 4, 6, -5, 42, -9, 14};
        double [] b = new double[(a.length / 2)];          // новый массив сумм
        double max = a[0];

        for (int i = 0; i < (a.length / 2); i++) {         //суммирование элементов массива
            b[i] = a[i] + a[a.length - (i + 1)];
            System.out.println(b[i]);
        }

        for (double elem : b) {                             //поиск максимума
            if (elem > max){
                max = elem;
            }
        }
        System.out.println("Максимальное число: " + max);
    }
}
