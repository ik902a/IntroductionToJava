package by.epam.with_classes.aggregation_and_composition.text;

public class Sentence {
    static int a = 0;

    public StringBuilder addTitle() {
        Word word = new Word();
        int i = 0;
        StringBuilder sentence = new StringBuilder();
        do {
            sentence.append(word.readTitle(i));
            i++;
        } while (sentence.charAt(sentence.length() - 1) != '.' &&
                sentence.charAt(sentence.length() - 1) != '!' &&
                sentence.charAt(sentence.length() - 1) != '?');
        return sentence;
    }

    public StringBuilder addSentence(){
        Word word = new Word();
        int i = 0;
        StringBuilder sentence = new StringBuilder();
        do {
            sentence.append(word.readText(i + a) + " ");
            if (sentence.charAt(sentence.length() - 2) == ',' ||
                    sentence.charAt(sentence.length() - 2) == ';' ||
                    sentence.charAt(sentence.length() - 2) == ':') {
                sentence.delete(sentence.length() - 3, sentence.length() - 2);
            }
            i++;
        } while (sentence.charAt(sentence.length() - 2) != '.' &&
                sentence.charAt(sentence.length() - 2) != '!' &&
                sentence.charAt(sentence.length() - 2) != '?');
        sentence.delete(sentence.length() - 3, sentence.length() - 2);
        a = i--;
        return sentence;
    }
}
