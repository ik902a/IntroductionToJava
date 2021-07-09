package by.epam.algorithmization.array;

// Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
// числом. Подсчитать количество замен.

public class Array2 {
    public static void main(String[] args) {
        double [] a = {5.0, 23.5, 42.42, 14.7, 37};
        double z = 30;
        int i = 0;

        for (int j = 0; j < a.length; j++) {
            if (a[j] > z) {
                a[j] = z;
                i++;
            }
            System.out.print(a[j] + " ");
        }
        System.out.println("\nКоличество замен: " + i);
    }
}
