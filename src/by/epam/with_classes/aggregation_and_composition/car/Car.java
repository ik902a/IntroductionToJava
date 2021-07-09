package by.epam.with_classes.aggregation_and_composition.car;

// Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
// менять колесо, вывести на консоль марку автомобиля.

public class Car {
    String name;
    String car;

    public Car (String name) {
        Engine engine = new Engine();
        Wheel wheel = new Wheel();
        this.name = name;
        car = name + " - ";
        car += engine.makeEngine();
        for (int i = 0; i < 4; i++) {
            car += " " + wheel.makeWheel();
        }
    }

    public static void main(String[] args) {
        Car carVW = new Car("VW");
        carVW.out(carVW.car);
        carVW.go(carVW.car);
        carVW.refuel(carVW.car);
        carVW.changeWheel(carVW.car);
        carVW.model(carVW.name);
    }

    public void out(String str) {
        System.out.println(str);
    }

    public void go(String str) {
        out(str + ": едет");
    }

    public void refuel(String str) {
        out(str + ": заправляется");
    }

    public void changeWheel(String str) {
        out (str + ": меняет колесо");
    }

    public void model(String str) {
        out ("Модель автомобиля: " + str);
    }
}
