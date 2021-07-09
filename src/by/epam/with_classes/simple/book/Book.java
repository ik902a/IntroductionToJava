package by.epam.with_classes.simple.book;

//Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
// toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. Задать
// критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

public class Book {
    int id;
    String name;
    String author;
    String publishingHouse;
    int year;
    int pageNum;
    int price;
    String binding;

    public Book(int id, String name, String author, String publishingHouse, int year, int pageNum, int price, String binding) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.pageNum = pageNum;
        this.price = price;
        this.binding = binding;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public int getPageNum() {
        return pageNum;
    }

    public int getPrice() {
        return price;
    }

    public String getBinding() {
        return binding;
    }

    @Override
    public String toString() {
        return getId() + "| \"" + getName() + "\" " + getAuthor() + " - " + getPrice() + "руб.";
    }
}
