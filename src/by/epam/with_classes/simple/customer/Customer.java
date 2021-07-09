package by.epam.with_classes.simple.customer;

// Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
// метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

public class Customer {
    int id;
    String lastName;
    String name;
    String patronymic;
    int cardNum;
    int accountNum;

    public Customer(int id, String lastName, String name, String patronymic, int cardNum, int accountNum){
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.patronymic = patronymic;
        this.cardNum = cardNum;
        this.accountNum = accountNum;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getCardNum() {
        return cardNum;
    }

    public int getAccountNum() {
        return accountNum;
    }

    @Override
    public String toString() {
        return getId() + "| " + getLastName() + " " + getName() + " " + getPatronymic();
    }
}
