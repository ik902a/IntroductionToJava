package by.epam.strings.as_an_object;

// Из заданной строки получить новую, повторив каждый символ дважды.

public class AsObject6 {
    public static void main(String[] args) {
        String str = "I have 5 apples, 17 plums, 2 pears, 10 bananas, 13 tangerines.";
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
        newStr += str.charAt(i);
        newStr += str.charAt(i);
        }

        System.out.println(newStr);
    }
}
