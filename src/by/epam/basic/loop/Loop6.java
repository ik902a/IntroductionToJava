package by.epam.basic.loop;

// Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class Loop6 {
    public static void main(String[] args) {
        char ch;

        for (int i = 0; i <= 100; i++) {
            ch = (char) i;
            System.out.println(ch + " |" + i);
        }
    }
}
