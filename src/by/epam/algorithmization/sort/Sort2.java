package by.epam.algorithmization.sort;

// Даны две последовательности a1<a2<..<an и b1<b2<..<bm. Образовать из них новую последовательность
//чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.

public class Sort2 {
    public static void main(String[] args) {
        int [] n = {-4, -1, 0, 10, 10};
        int [] m = {-8, -1, 10, 42};
        int [] union = new int [n.length + m.length];
        int i = 0;
        int j = 0;

        for (int elem = 0; elem < (n.length + m.length); elem++) {
            if ((i < n.length && j < m.length && n[i] < m[j]) || (i < n.length && j == m.length)) {
                union[elem] = n[i];
                i++;
                continue;
            }
            if (i < n.length && j < m.length && n[i] > m[j] || (j < m.length && i == n.length)) {
                union[elem] = m[j];
                j++;
                continue;
            }
            if (i < n.length && j < m.length && n[i] == m[j]) {
                union[elem] = n[i];
                i++;
                elem++;
                union[elem] = m[j];
                j++;
            }
        }

        for (int elem : union) {
            System.out.print(elem + " ");
        }
    }
}
