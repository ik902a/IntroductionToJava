package by.epam.algorithmization.array;

// В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.

public class Array9 {
    public static void main(String[] args) {
        int [] a = {42, 50, 1, 2, 42, 2, 50, 42, 50, 6};
        int [] per = new int[10];
        int max;
        int min;

        for (int i = 0; i < a.length; i++) {       // Находим повторяющиеся числа и определяем колическтво этих повторов
            for (int j = 1; j < a.length; j++) {
                if(a[i] - a[j] == 0) {
                    per[i] += 1;
                }
            }
        }

        max = per[0];
        for (int i = 0; i < per.length; i++) {   // Определяем максимальное количество повторов
            if (per[i] > max){
                max = per[i];
            }
        }

        min = a[0];
        for (int i = 0; i < a.length; i++) {      // Определяем минимальное число с максимальным количеством повторов
            if (per[i] == max && a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("\nОтвет: " + min);
    }
}
