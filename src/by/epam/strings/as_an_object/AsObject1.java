package by.epam.strings.as_an_object;

// Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class AsObject1 {
    public static void main(String[] args) {
        String str = "   I have  5 apples, 17   plums, 2         pears, 10      bananas,        13 tangerines.   ";
        int num;
        int max = 1;

        for (int i = 0; i < str.length(); i++) {
            num = 0;
            while (i < str.length() && str.charAt(i) == ' ') {
                num ++;
                i++;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println(max);
    }
}
