package by.epam.algorithmization.sort;

// Сортировка вставками. Дана последовательность чисел a1, a2,.., an. Требуется переставить числа в порядке
//возрастания. Делается это следующим образом. Пусть a1, a2,.., ai - упорядоченная последовательность, т. е.
//a1<a2<..<an. Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
//последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
//не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
//с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

public class Sort5 {
    static int [] a = {4, 11, 42, 7, 12, 5, 15, 55, 7, 24};
    static int [] seq = new int[a.length];

    public static void main(String[] args) {
        seq[0] = a[0];
        int box1;
        int box2;

        for (int i = 1; i < a.length; i++) {
            int searchPos = binarySearch(a[i], i);
            if (searchPos == i){
                box1 = a[i];
            } else {
                box1 = seq[searchPos];
            }
            seq[searchPos] = a[i];
            for (int j = searchPos + 1; j < i; j++) {
                box2 = seq[j];
                seq[j] = box1;
                box1 = box2;
            }
            seq[i] = box1;
        }

        for (int elem : seq) {
            System.out.print(elem + " ");
        }
    }


    private static int binarySearch(int obj, int n) {
        int first = 0;
        int last = n - 1;
        int pos = last;
        int middle;

        while (last - first > 1) {
            middle = (last - first) / 2;
            if (obj > seq[middle + first]) {
                first = middle + first;
                pos = last;
            }
            if (obj < seq[middle + first]) {
                last = middle + first - 1;
                pos = first;
            }
            if (obj == seq[middle + first]) {
                pos = middle + first;
                break;
            }
        }
        if (obj > seq[pos]) {
            pos++;
        }
        return pos;
    }
}

