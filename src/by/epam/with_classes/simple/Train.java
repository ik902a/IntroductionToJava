package by.epam.with_classes.simple;
// Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
// Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива
// по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
// Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения
// должны быть упорядочены по времени отправления.

import java.util.Scanner;

public class Train {
    String name;
    String number;
    String time;

    public Train(String name, String number, String time) {
        this.name = name;
        this.number = number;
        this.time = time;
    }

    public static void main(String[] args) {
        Train[] array = {new Train("Москва", "5", "12:00"),
                new Train("Киев", "1", "12:30"),
                new Train("Варшава", "2", "9:30"),
                new Train("Киев", "4", "11:00"),
                new Train("Рига", "3", "15:00")};
        sort(array);
        selection(array);
        citySort(array);
        for (Train elem : array) {
            System.out.println(elem.number + " " + elem.name);
        }
    }

    public static void sort(Train[] array) {
        Train buf;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (Integer.parseInt(array[j].number) <= Integer.parseInt(array[j - 1].number)) {
                    buf = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = buf;
                }
            }
        }
    }

    public static void selection(Train[] array) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер поезда: ");
        int num = in.nextInt();
        System.out.println();
        in.close();
        if (num <= 0 || num > 5) {
            System.out.println("Вы ввели неверное значение");
            return;
        }
        for (Train elem : array) {
            if (num == Integer.parseInt(elem.number)) {
                System.out.println(elem.number + " " + elem.name + " отправляется в " + elem.time);
            }
        }
    }

    public static void citySort(Train[] array) {
        Train buf;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j].name.compareTo(array[j - 1].name) < 0) {
                    buf = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = buf;
                }
                if (array[j].name.compareTo(array[j - 1].name) == 0 &&
                        array[j].time.compareTo(array[j - 1].time) <= 0) {
                    buf = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = buf;
                }
            }
        }
    }
}
