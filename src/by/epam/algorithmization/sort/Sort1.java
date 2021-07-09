package by.epam.algorithmization.sort;

// Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//дополнительный массив.

public class Sort1 {
    public static void main(String[] args) {
        int [] n = {4, 7, 1, 5, 9};
        int [] m = {-3, -8, -5};
        int k = 3;
        int [] union = new int [n.length + m.length];

        for (int i = 0; i < (n.length + m.length); i++) {
            if (i < k) {
                union[i] = n[i];
            }
            if (i > (k + m.length - 1)) {
                union[i] = n[i - m.length];
            }
            if (i >= k && i < (k + m.length)) {
                union[i] = m[i - k];
            }
        }

        for (int elem : union) {
            System.out.print(elem + " ");
        }
    }
}
