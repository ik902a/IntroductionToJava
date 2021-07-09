package by.epam.strings.as_an_array;

// В строке найти количество чисел.

public class AsArray4 {
    public static void main(String[] args) {
        String str = "I have 5 apples, 17 plums, 2 pears, 10 bananas, 13 tangerines.";
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                num++;
                do {
                    i++;
                } while (str.charAt(i) >= '0' && str.charAt(i) <= '9');
            }
        }

        System.out.println("Количество чисел в строке: " + num);
    }
}