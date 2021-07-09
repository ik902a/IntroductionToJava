package by.epam.strings.as_an_object;

// Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class AsObject5 {
    public static void main(String[] args) {
        String str = "I have 5 apples, 17 plums, 2 pears, 10 bananas, 13 tangerines.";
        int num = 0;

        for (int i =0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                num++;
            }
        }

        System.out.println("количество букв \"а\" в строке - " + num);
    }
}
