package by.epam.algorithmization.array;

// Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

public class Array10 {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < a.length; i++) {
            if(i <= a.length / 2 && a.length % 2 != 0 || i < a.length / 2 && a.length % 2 == 0) {
                a[i] = a[i + i];
            } else {
                a[i] = 0;
            }
            System.out.print(a[i] + " ");
        }
    }
}
