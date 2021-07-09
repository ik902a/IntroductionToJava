package by.epam.with_classes.aggregation_and_composition.text;

// Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
// вывести на консоль текст, заголовок текста.

public class Text {
    public static void main(String[] args) {
        Text text = new Text();
        String str;
        Sentence sentence = new Sentence();

        str = String.valueOf(sentence.addTitle());
        text.out(str + "\n");
        str = String.valueOf(sentence.addSentence());
        text.out(str);
        str = String.valueOf(sentence.addSentence());
        text.out(str);
        str = String.valueOf(sentence.addSentence());
        text.out(str);
    }

    public void out(String str) {
        System.out.print(str);
    }
}
