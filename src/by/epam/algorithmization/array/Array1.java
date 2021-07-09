package by.epam.algorithmization.array;

// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Array1 {
    public static void main(String[] args) {
        int sum = 0;
        int k = 7;
        int [] a = {10, 7, 42, 15, 21};

        for (int elem : a) {
            if (elem % k == 0) {
                sum += elem;
            }
        }
        System.out.println(sum);
    }
}
