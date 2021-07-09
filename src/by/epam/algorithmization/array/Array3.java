package by.epam.algorithmization.array;

// Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.

public class Array3 {
    public static void main(String[] args) {
        double [] a ={0, 2, 0, -3, 5};
        int pos = 0;
        int neg = 0;
        int zero = 0;

        for (double elem : a) {
            if (elem > 0) {
                pos++;
            }
            if (elem < 0) {
                neg++;
            }
            if (elem == 0) {
                zero++;
            }
        }
        System.out.println("Положительных чисел: " + pos);
        System.out.println("Отрицательных чисел: " + neg);
        System.out.println("Равных нулю: " + zero);
    }
}
