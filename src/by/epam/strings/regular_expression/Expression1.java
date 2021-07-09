package by.epam.strings.regular_expression;

// Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
// операции:
// отсортировать абзацы по количеству предложений;
// в каждом предложении отсортировать слова по длине;
// отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
// а в случае равенства – по алфавиту.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expression1 {
    static String str = "Once when I was six years old I saw a magnificent picture in a book, called True Stories from " +
            "Nature, about the primeval forest. It was a picture of a boa constrictor in the act of swallowing" +
            " an animal. Here is a copy of the drawing.\n" +
            "In the book it said: \"Boa constrictors swallow their prey whole, without chewing it. After that " +
            "they are not able to move, and they sleep through the six months that they need for digestion.\"\n" +
            "I pondered deeply, then, over the adventures of the jungle. And after some work with a colored " +
            "pencil I succeeded in making my first drawing. My Drawing Number One! It looked like this.";

    public static void main(String[] args) {
        int option = 3;                         // Ввод номера операции
        String entry = "t";

        switch (option) {
            case 1:
                sortParagraph();
                break;
            case 2:
                sortLength();
                break;
            case 3:
                sortEntry(entry);
                break;
            default:
                System.out.println("Неправильно введен вариант");
                break;
        }
    }

    private static String[] sort(int[] numeral, String[] symbol) {
        int buf;
        String strBuf;

        for (int i = 0; i < numeral.length - 1; i++) {
            for (int j = 0; j < numeral.length - 1; j++) {
                if (numeral[j] > numeral[j + 1]) {           // Синхронно сортируем два массива
                    buf = numeral[j];                        // по данным из массива numeral сортируем массив symbol
                    numeral[j] = numeral[j + 1];
                    numeral[j + 1] = buf;
                    strBuf = symbol[j];
                    symbol[j] = symbol[j + 1];
                    symbol[j + 1] = strBuf;
                }
            }
        }

        return symbol;
    }

    private static String[] modifier() {                // Предварительная модификация текста для последующей обработки
        String modifier = str.replaceAll("[^a-zA-Z.!? ]", ""); // Убираем неиспользуемые символы из текста
        String sent = "[.!?]";
        String[] strMod = modifier.split(sent);                  // Создаем массив предложений из текста

        for (int i = 0; i < strMod.length; i++) {               // Убираем лишние пробелы (в начале и конце предложений)
            strMod[i] = strMod[i].trim();
        }

        return strMod;
    }

    private static void output(String[] array) {
        for (String elem : array) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    private static void sortParagraph() {
        String par = "(\\n|\\z)";
        String[] strPar = str.split(par);            // Разделяем текст на абзацы

        int[] dot = new int[strPar.length];  // Массив, в котором будет храниться каличество предложений для каждого абзаца
        for (int i = 0; i < dot.length; i++) {       // Ищем количество предложений в каждом абзаце
            int num = 0;
            String sen = "[.!?]";
            Pattern p2 = Pattern.compile(sen);
            Matcher mSen = p2.matcher(strPar[i]);
            while (mSen.find()) {
                num++;
            }
            dot[i] = num;
        }
        strPar = sort(dot, strPar);                  // Вызываем метод сортировки абзацев

        for (String elem : strPar) {
            System.out.println(elem);
        }
    }

    private static void sortLength() {
        String[] strSen = modifier();                         // Модифицируем введенный текст

        for (int i = 0; i < strSen.length; i++) {            // Находим длинны слов для каждого предложения
            String[] words = strSen[i].split(" ");
            int[] numLetter = new int[words.length];
            for (int j = 0; j < numLetter.length; j++) {
                numLetter[j] = words[j].length();
            }

            words = sort(numLetter, words);                 // Отправляем данные на сортировку
            output(words);
        }
    }

    private static void sortEntry(String entry) {
        String[] strSen = modifier();                      // Модифицируем введенный текст

        for (int i = 0; i < strSen.length; i++) {
            String[] words = strSen[i].split(" ");   // Разделяем каждое предложение на слова
            int[] numEntry = new int[words.length];         // Массив для соответствующих длин слов

            for(int j = 0; j < numEntry.length; j++) {      // Подсчитываем количество вхождений в каждое слово
                int num = 0;
                Pattern p = Pattern.compile(entry);
                Matcher m = p.matcher(words[j].toLowerCase());  // Учитываем регистр символа
                while (m.find()) {
                    num--;                                     // Чем больше вхождений, тем меньше число
                }
                numEntry[j] = num;
            }

            words = sort(numEntry, words);                    // Отправляем данные на сортировку

            String buf;
            for (int a = 0; a < words.length - 1; a++) {       //  Если количество вхождений в слово одинаково
                for (int b = 0; b < words.length - 1; b++) {   // сортируем ещё раз по алфавиту
                    if (numEntry[b] == numEntry[b + 1]) {
                        if ((words[b].toLowerCase()).compareTo(words[b + 1].toLowerCase()) >= 0) {
                            buf = words[b];
                            words[b] = words[b + 1];
                            words[b + 1] = buf;
                        }
                    }
                }
            }
            output(words);
        }
    }
}
