package by.epam.with_classes.simple;

// Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
// из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
// номеров групп студентов, имеющих оценки, равные только 9 или 10.

public class Student {
    String name;
    String initial;
    String group;
    int[] rating = new int[5];

    public Student(String name, String initial, String group, int[] rating) {
        this.name = name;
        this.initial = initial;
        this.group = group;
        this.rating = rating;
    }

    public static void main(String[] args) {
        Student [] array = {new Student("Иванов", "А.А.", "ТЭА-051", new int[] {5, 6, 5, 7, 7}),
                        new Student("Петров", "А.Б.", "ТЭА-052", new int[] {9, 7, 6, 9, 7}),
                        new Student("Сидоров", "А.В.", "ТЭА-052", new int[] {6, 6, 7, 9, 5}),
                        new Student("Ильюшин", "С.В.", "ТЭА-051", new int[] {7, 6, 10, 7, 10}),
                        new Student("Сухой", "П.О.", "ТЭА-052", new int[] {9, 10, 10, 9, 9}),
                        new Student("Кошкин", "М.И.", "ТЭА-051", new int[] {8, 8, 9, 7, 7}),
                        new Student("Циолковский", "К.Э.", "ТЭА-052", new int[] {8, 9, 10, 8, 9}),
                        new Student("Королев", "С.П.", "ТЭА-051", new int[] {10, 10, 9, 9, 10}),
                        new Student("Гагарин", "Ю.А.", "ТЭА-051", new int[] {9, 9, 9, 9, 10}),
                        new Student("Маск", "И.Э.", "ТЭА-052", new int[] {5, 4, 5, 3, 4})};
        for (int i = 0; i < array.length; i++) {
            array[i].chek();
        }
    }

    public void chek() {
        int chek = 0;
        for (int elem : rating) {
            if (elem >= 9) {
                chek++;
            }
        }
        if (chek == 5) {
            System.out.println(name + " " + group);
        }
    }
}
