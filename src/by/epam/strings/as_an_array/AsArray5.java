package by.epam.strings.as_an_array;

// Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
// Крайние пробелы в строке удалить.

public class AsArray5 {
    public static void main(String[] args) {
        String str = "    I have  5 apples, 17   plums, 2      pears, 10      bananas,    13 tangerines. ";
        str = str.trim();
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            newStr += String.valueOf(str.charAt(i));
            if (str.charAt(i) == ' ') {
                do {
                    i++;
                }  while (str.charAt(i) == ' ');
                newStr += String.valueOf(str.charAt(i));
            }
        }

        System.out.println(newStr);
    }
}
