package by.epam.algorithmization.array;

// Дана последовательность целых чисел A1, A2, ..., An. Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min( A1, A2, ..., An).

public class Array8 {
    public static void main(String[] args) {
        int [] a = {1, 2, -3, 4, 5, -3, 7, 1, 9, 10};
        int [] b;
        int min = a[0];
        int n = 0;
        int m = 0;

        for (int elem : a ) {
            if (min > elem) {
                min = elem;
            }
        }

        for (int elem : a ) {                    // Узнаем сколько чисел надо будет удалить
            if (elem == min) {
                n++;
            }
        }

        b = new int [a.length - n];               // Создаем новый массив
        for (int i = 0; i < a.length; i++) {
            if (a[i] == min) {
                m++;
            }else {
                b[i - m] = a[i];
                System.out.print(b[i - m] + " ");
            }
        }
    }
}
