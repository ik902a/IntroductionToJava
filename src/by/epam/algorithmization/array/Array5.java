package by.epam.algorithmization.array;

// Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class Array5 {
    public static void main(String[] args) {
        int [] a = {5, -4, 42, 2, 13};

        for (int i = 0; i < a.length; i++) {
            if (a[i] > (i)){
                System.out.println(a[i]);
            }
        }
    }
}
