package by.epam.strings.as_an_object;

// Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
// Учитывать только английские буквы.

public class AsObject9 {
    public static void main(String[] args) {
        String str = "I have 5 Apples, 17 Plums, 2 Pears, 10 Bananas, 13 Tangerines.";
        int upLetter = 0;
        int lowLetter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                upLetter++;
            }
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                lowLetter++;
            }
        }

        System.out.println("Количество прописных букв в строке - " + upLetter);
        System.out.println("Количество строчных букв в строке - " + lowLetter);
    }
}
