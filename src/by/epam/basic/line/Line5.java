package by.epam.basic.line;

// Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
// Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
// ННч ММмин SSc.

public class Line5 {
    public static void main(String[] args) {
        int t = 3661;
        int s;
        int m;
        int h;

        h = t / 3600;
        t = t - h * 3600;
        m = t / 60;
        s = t - m * 60;
        System.out.println(h + "h " + m + "min " + s + "sek");
     }
}
