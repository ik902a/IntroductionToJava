package by.epam.strings.as_an_object;

// Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
// Случай, когда самых длинных слов может быть несколько, не обрабатывать.

public class AsObject8 {
    public static void main(String[] args) {
        String str = "I have apples plums tangerines pears bananas";
        String word = "";
        String maxWord = word;

        for (int i = 0; i< str.length(); i++) {
            word += str.charAt(i);
            if (str.charAt(i) == ' ') {
                if (word.length() > maxWord.length()) {
                    maxWord = word;
                }
                word = "";
            }
        }

        System.out.println(maxWord.trim());
    }
}
