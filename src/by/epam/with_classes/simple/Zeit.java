package by.epam.with_classes.simple;

// Составьте описание класса для представления времени. Предусмотрте возможности установки времени и изменения его
// отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений
// полей поле устанавливается в значение 0. Создать методы изменения времени на заданное количество часов, минут
// и секунд.

import java.util.Scanner;

public class Zeit {
    int hour;
    int minute;
    int second;

    public static void main(String[] args) {
        Zeit watch = new Zeit();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите часы: ");
         int hour = in.nextInt();
        watch.setHour(hour);
        System.out.print("Введите минуты: ");
        int minute = in.nextInt();
        watch.setMinute(minute);
        System.out.print("Введите секунды: ");
        int second = in.nextInt();
        watch.setSecond(second);

        watch.out(watch.getHour(), watch.getMinute(), watch.getSecond());
        System.out.println();

        System.out.print("На сколько часов вы хотите изменить время: ");
        hour = in.nextInt();
        System.out.print("На сколько минут вы хотите изменить время: ");
        minute = in.nextInt();
        System.out.print("На сколько секунд вы хотите изменить время: ");
        second = in.nextInt();
        in.close();
        watch.calculator(hour, minute, second);
        watch.out(watch.getHour(), watch.getMinute(), watch.getSecond());

    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 25) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 61) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 61) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    public void calculator (int hour, int minute, int second) {
        int bufMin = (this.second + second) / 60;
        this.second = (this.second + second) % 60;
        int bufHour = (this.minute + minute + bufMin) / 60;
        this.minute = (this.minute + minute + bufMin) % 60;
        this.hour = (this.hour + hour + bufHour) % 24;
    }

    public String getHour() {
        String hour;
        if (this.hour < 10) {
            hour = "0" + this.hour;
        } else {
            hour = "" + this.hour;
        }
        return hour;
    }

    public String getMinute() {
        String minute;
        if (this.minute < 10) {
            minute = "0" + this.minute;
        } else {
            minute = "" + this.minute;
        }
        return minute;
    }

    public String getSecond() {
        String second;
        if (this.second < 10) {
            second = "0" + this.second;
        } else {
            second = "" + this.second;
        }
        return second;
    }

    public void out (String hour, String minute, String second) {
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
