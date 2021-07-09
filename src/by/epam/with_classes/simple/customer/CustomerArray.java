package by.epam.with_classes.simple.customer;

// Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
// метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

public class CustomerArray {
    Customer[] customerArray = new Customer[10];

    public static void main(String[] args) {
        CustomerArray array = new CustomerArray();
        array.customerArray[0] = new Customer(1, "Гагарин", "Юрий", "Алексеевич", 1111, 3111);
        array.customerArray[1] = new Customer(2, "Армстронг", "Нил", "Стивенович", 1112, 3112);
        array.customerArray[2] = new Customer(3, "Леонов", "Алексей", "Архипович", 1113, 3113);
        array.customerArray[3] = new Customer(4, "Терешкова", "Валентина", "Владимировна", 1114, 3114);
        array.customerArray[4] = new Customer(5, "Королев", "Сергей", "Павлович", 1115, 3115);
        array.customerArray[5] = new Customer(6, "Маск", "Илон", "Эрролович", 1116, 3116);
        array.customerArray[6] = new Customer(7, "Сухой", "Павел", "Осипович", 1117, 3117);
        array.customerArray[7] = new Customer(8, "Миль", "Михаил", "Леонтьевич", 1118, 3118);
        array.customerArray[8] = new Customer(9, "Кошкин", "Михаил", "Ильич", 1119, 3119);
        array.customerArray[9] = new Customer(10, "Туполев", "Андрей", "Николаевич", 1121, 3121);

        array.sort();
        for (Customer elem : array.customerArray) {
            System.out.println(elem.toString());
        }

        int a = 1113;
        int b = 1117;
        System.out.println("\nСписок покупателей с номером кредитной карточки от " + a + " до " + b + ":");
        array.interval(a, b);
    }

    public void sort() {
        for (int i = 0; i < customerArray.length; i++) {
            for (int j = 1; j < customerArray.length; j++) {
                if (customerArray[j].lastName.compareTo(customerArray[j - 1].lastName) < 0) {
                    swap(j, j - 1);
                } else if (customerArray[j].lastName.compareTo(customerArray[j - 1].lastName) == 0) {
                    if (customerArray[j].name.compareTo(customerArray[j - 1].name) < 0) {
                        swap(j, j - 1);
                    } else if (customerArray[j].name.compareTo(customerArray[j - 1].name) == 0) {
                        if (customerArray[j].patronymic.compareTo(customerArray[j - 1].patronymic) <= 0) {
                            swap(j, j - 1);
                        }
                    }
                }
            }
        }
    }

    public void swap (int x, int y) {
        Customer buf = customerArray[x];
        customerArray[x] = customerArray[y];
        customerArray[y] = buf;
    }

    public void interval(int x, int y) {
        for (Customer elem : customerArray) {
            if (elem.cardNum > x && elem.cardNum < y) {
                System.out.println(elem.toString());
            }
        }
    }
}
