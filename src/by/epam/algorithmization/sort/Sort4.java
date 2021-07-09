package by.epam.algorithmization.sort;

// Сортировка обменами. Дана последовательность чисел a1<a2<..<an.Требуется переставить числа в
//порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1 . Если ai>ai+1, то делается
//перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

public class Sort4 {
    public static void main(String[] args) {
        int [] a = {4, 2, 42, 10, 2};
        int box;
        int calc = 0;

        for (int i = 0 ; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    box = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = box;
                    calc++;
                }
            }
        }

        for (int elem : a) {
            System.out.print(elem + " ");
        }
        System.out.print("\nКоличество перестановок: " + calc);
    }
}
