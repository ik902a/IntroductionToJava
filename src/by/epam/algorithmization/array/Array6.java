package by.epam.algorithmization.array;

// Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.

public class Array6 {
    public static void main(String[] args) {
        double [] a = {5, 10, -65, 5, -10, 42, 5, 25, 35, 10, 11};
        double sum = 0;
        boolean logic;

        for (int i = 1; i <= a.length; i++) {
            logic = true;
            for (int j = 2; j < i; j++) {      // Проверяем является ли порядковый номер простым числом
                if (i % j == 0){
                    logic = false;
                }
            }
            if (logic) {
                sum += a[i - 1];
            }
        }
        System.out.println(sum);
    }
}
