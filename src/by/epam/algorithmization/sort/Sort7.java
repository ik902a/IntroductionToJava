package by.epam.algorithmization.sort;

// Пусть даны две неубывающие последовательности действительных чисел a1<a2<..<an и b1<b2<..<bm.
//Требуется указать те места, на которые нужно вставлять элементы последовательности b1<b2<..<bm в первую
//последовательность так, чтобы новая последовательность оставалась возрастающей.

public class Sort7 {
    public static void main(String[] args) {
        int [] a = {-4, -1, 0, 10, 10};
        int [] b = {-8, -1, 1, 42};
        int box = 1;

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (b[i] > a[j]) {
                    box = j + 2;
                }
                if (b[i] == a[j]) {
                    box = j + 1;
                }
                if (b[i] < a[j]) {
                    break;
                }
            }
            System.out.println("Элемент " + b[i] + " необходимо поставить на позицию " + box);
        }
    }
}
