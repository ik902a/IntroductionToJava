package by.epam.strings.as_an_object;

// Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например,
// если было введено "abc cde def", то должно быть выведено "abcdef".

public class AsObject7 {
    public static void main(String[] args) {
        String str = "I have 5 apples, 17 plums, 2 pears, 10 bananas, 13 tangerines.";
        String newStr = "";
        boolean logic;

        for (int i = 0 ; i < str.length(); i++) {
            logic = true;
            for (int j = 0; j < newStr.length(); j++) {
                if (str.charAt(i) == newStr.charAt(j) || str.charAt(i) == ' ') {
                    logic = false;
                    break;
                }
            }
            if (logic) {
                newStr += str.charAt(i);
            }
        }

        System.out.println(newStr);
    }
}
