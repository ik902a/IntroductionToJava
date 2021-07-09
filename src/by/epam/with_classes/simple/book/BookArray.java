package by.epam.with_classes.simple.book;

//Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
// toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. Задать
// критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

public class BookArray {
    Book[] bookArray = new Book[10];

    public static void main(String[] args) {
        BookArray array = new BookArray();
        array.bookArray[0] = new Book(1, "Мастер и Маргарита", "Булгаков М.А.", "Попурри", 1967, 416, 25, "твердый");
        array.bookArray[1] = new Book(2, "Собачье сердце", "Булгаков М.А.", "Азбука", 1987, 284, 17, "твердый");
        array.bookArray[2] = new Book(3, "Записки юного врача", "Булгаков М.А.", "Эксмо", 1981, 192, 8, "мягкий");
        array.bookArray[3] = new Book(4, "Иван Васильевич", "Булгаков М.А.", "Попурри", 1965, 114, 5, "мягкий");
        array.bookArray[4] = new Book(5, "12 стульев", "Ильф И.А и Петров Е.К.", "Азбука", 1928, 448, 27, "твердый");
        array.bookArray[5] = new Book(6, "Одноэтажная Америка", "Ильф И.А и Петров Е.К.", "Азбука", 1937, 364, 17, "мягкий");
        array.bookArray[6] = new Book(7, "Обитаемый остров", "Стругацкий А.Н и Стругацкий Б.Н.", "Эксмо", 1969, 416, 25, "твердый");
        array.bookArray[7] = new Book(8, "Пикник на обочине", "Стругацкий А.Н и Стругацкий Б.Н.", "АСТ", 1972, 156, 10, "мягкий");
        array.bookArray[8] = new Book(9, "Трудно быть богом", "Стругацкий А.Н и Стругацкий Б.Н.", "АСТ", 1964, 224, 15, "твердый");
        array.bookArray[9] = new Book(10, "Метро 2033", "Глуховский Д.А.", "Эксмо", 2007, 384, 23, "твердый");
        String author = "Булгаков М.А.";
        System.out.println("Писатель " + author + ":");
        array.sortAuthor(author);
        String publishingHouse = "Эксмо";
        System.out.println("\nКниги издательства " + publishingHouse + ":");
        array.sortPublishingHouse(publishingHouse);
        int year = 1970;
        System.out.println("\nКниги изданные после " + year + " года:");
        array.sortYear(year);
    }

    public void sortAuthor(String x) {
        for (Book elem : bookArray) {
            if (x.equals(elem.getAuthor())) {
                System.out.println(elem.toString());
            }
        }
    }

    public void sortPublishingHouse(String x) {
        for (Book elem : bookArray) {
            if (x.equals(elem.getPublishingHouse())) {
                System.out.println(elem.toString());
            }
        }
    }

    public void sortYear(int x) {
        for (Book elem : bookArray) {
            if (elem.getYear() >= x) {
                System.out.println(elem.toString());
            }
        }
    }
}
