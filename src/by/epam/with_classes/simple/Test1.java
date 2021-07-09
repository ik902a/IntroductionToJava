package by.epam.with_classes.simple;

// Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
// Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение
// из этих двух переменных.

public class Test1 {

        static int a;
        static int b;
    {
        a = 4;
        out("Первое число " + a);
        b = 2;
        out("Второе число " + b);
    }

    public static void main(String[] args) {
        Test1 test = new Test1();
        test.sum(a, b);
        test.max(a, b);

    }

    public void out(String str) {
        System.out.println(str);
    }

     public void sum (int a, int b) {
        out("Сумма чисел равна " + (a + b));
    }

    public void max(int a, int b) {
        if (a > b) {
            out("Большее значение равно " + a);
        } if (a < b) {
            out("Большее значение равно " + b);
        } else {
            out("Значения равны");
        }
    }
}
