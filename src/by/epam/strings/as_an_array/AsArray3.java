package by.epam.strings.as_an_array;

// В строке найти количество цифр.

public class AsArray3 {
    public static void main(String[] args) {
        String str = "I have 5 apples, 17 plums, 2 pears, 10 bananas, 13 tangerines.";
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                num++;
            }
        }

        System.out.println("Количество цифр в строке: " + num);
    }
}
