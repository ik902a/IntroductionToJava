package by.epam.with_classes.simple;

// Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу
// в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
// Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
// Написать код, демонстрирующий все возможности класса.

import java.util.Scanner;

public class DecimalСounter {
    int min;
    int max;
    int number;
    {
        min = 0;
        max = 10;
    }
    public DecimalСounter() {
        number = 1;
    }

    public DecimalСounter(int num) {
        number = num;
    }

    public static void main(String[] args) {
        DecimalСounter counter = new DecimalСounter();
        DecimalСounter counter2 = new DecimalСounter((int) (Math.random() * 10));
        counter.out(counter.number);
        counter2.out(counter2.number);
        Scanner in = new Scanner(System.in);
        System.out.print("Введите + или -: ");
        String choiсe = in.nextLine();
        System.out.println();
        in.close();
        if (choiсe.equals("+")) {
            counter.number = counter.increase(counter.number);
            counter2.number = counter2.increase(counter2.number);
        } else if (choiсe.equals("-")) {
            counter.number = counter.decrease(counter.number);
            counter2.number = counter2.decrease(counter2.number);
        } else {
            System.out.println("Вы ввели неправильное значение");
        }
        counter.out(counter.number);
        counter2.out(counter2.number);
    }
    public int decrease(int num){
        if (--num < min) {
            num = min;
        }
        return num;
    }

    public int increase(int num) {
        if (++num > max) {
            num = max;
        }
        return num;
    }
    public void out(int num) {
        System.out.println("Текущее значение счетчика " + num );
    }

}
