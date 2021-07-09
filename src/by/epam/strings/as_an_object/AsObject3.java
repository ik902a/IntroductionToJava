package by.epam.strings.as_an_object;

// Проверить, является ли заданное слово палиндромом.

public class AsObject3 {
    public static void main(String[] args) {
        String pal = "шалаш";
        boolean logic = false;

        for (int i = 0; i < pal.length() / 2; i++) {
            if (pal.charAt(i) == pal.charAt(pal.length() - (i + 1))) {
                logic = true;
            }
            else {
                logic = false;
                break;
            }
        }

        if (logic) {
            System.out.println("Слово является палиндромом");
        } else {
            System.out.println("Слово не палиндромом");
        }
    }
}
