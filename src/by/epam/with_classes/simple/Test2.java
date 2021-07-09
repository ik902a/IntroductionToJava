package by.epam.with_classes.simple;

// Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
// инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.

public class Test2 {
    int a;
    int b;

    public Test2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Test2() {
        a = 1;
        b = 1;
    }

    public static void main(String[] args) {
        Test2 test = new Test2(4, 2);
        Test2 defaultTest = new Test2();
        test.setA(5);
        test.setB(5);
        System.out.println("Число A " + test.getA());
        System.out.println("Число B " + test.getB());
        System.out.println("Число A по умолчанию " + defaultTest.getA());
        System.out.println("Число B по умолчанию " + defaultTest.getB());
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
