package by.epam.with_classes.simple.airline;

// Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
// toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

public class AirlineArray {
    Airline[] airlineArray = new Airline[5];

    public static void main(String[] args) {
        AirlineArray array = new AirlineArray();
        array.airlineArray[0] = new Airline("Москва", 111, "Boeing-737", "11.05", "понедельник, среда");
        array.airlineArray[1] = new Airline("Киев", 112, "Sukhoi SuperJet-100", "10.35", "вторник, четверг");
        array.airlineArray[2] = new Airline("Москва", 113, "Airbus A310", "13.00", "воскресенье");
        array.airlineArray[3] = new Airline("Вильнюс", 114, "Airbus A310", "08.25", "понедельник, четверг");
        array.airlineArray[4] = new Airline("Санкт-Петербург", 115, "Boeing-737", "10.35", "среда, пятница");
        String city = "Москва";
        System.out.println("Самолеты вылетающие в г." + city + ":");
        array.citySort(city);
        String day = "четверг";
        System.out.println("Самолеты вылетающие в " + day + ":");
        array.daySort(day);
        String time = "10.30";
        System.out.println("Самолеты вылетающие в " + day + " после " + time + ":");
        array.timeSort(day, time);
    }

    public void citySort(String x) {
        for (Airline elem : airlineArray) {
            if (x.equals(elem.getCity())) {
                System.out.println(elem.toString());
            }
        }
    }

    public void daySort(String x) {
        for (Airline elem : airlineArray) {
            if (elem.getDay().matches(".*" + x + ".*")) {
                System.out.println(elem.toString());
            }
        }
    }

    public void timeSort(String x, String y) {
        for (Airline elem : airlineArray) {
            if (elem.getDay().matches(".*" + x + ".*")
                    && Integer.parseInt(elem.getTime().substring(0, 2)) >= Integer.parseInt(y.substring(0, 2))
                    && Integer.parseInt(elem.getTime().substring(3)) >= Integer.parseInt(y.substring(3)))  {
                System.out.println(elem.toString());
            }
        }
    }
}
