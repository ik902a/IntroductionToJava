package by.epam.with_classes.simple.airline;

// Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
// toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

public class Airline {
    String city;
    int number;
    String type;
    String time;
    String day;

    public Airline(String city, int number, String type, String time, String day) {
        this.city = city;
        this.number = number;
        this.type = type;
        this.time = time;
        this.day = day;
    }

    public String getCity() {
        return city;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public String getTime() {
        return time;
    }

    public String getDay() {
        return day;
    }

    @Override
    public String toString() {
        return getNumber() + "| " + getCity() + " - " + getTime();
    }
}
