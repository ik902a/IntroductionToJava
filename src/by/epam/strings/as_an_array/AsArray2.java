package by.epam.strings.as_an_array;

// Замените в строке все вхождения 'word' на 'letter'.

public class AsArray2 {
    public static void main(String[] args) {
        String str = "I wrote the word. I see the word. I read the word.";
        String newStr ="";

        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith("word", i)) {
                newStr += "letter";
                i += 3;
            } else {
                newStr += str.charAt(i);
            }
        }

        System.out.print(newStr);
    }
}
