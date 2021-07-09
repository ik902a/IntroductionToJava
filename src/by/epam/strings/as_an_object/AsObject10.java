package by.epam.strings.as_an_object;

// Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или
// вопросительным знаком. Определить количество предложений в строке X.

public class AsObject10 {
    public static void main(String[] args) {
        String str = "I showed my masterpiece to the grown−ups, and asked them whether the drawing\n" +
                "frightened them.\n" +
                "But they answered: \"Frighten? Why should any one be frightened by a hat?\"\n" +
                "My drawing was not a picture of a hat. It was a picture of a boa constrictor\n" +
                "digesting an elephant. But since the grown−ups were not able to understand it, I\n" +
                "made another drawing: I drew the inside of the boa constrictor, so that the\n" +
                "grown−ups could see it clearly. They always need to have things explained. My\n" +
                "Drawing Number Two looked like this.";
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.' || str.charAt(i) == '!' || str.charAt(i) == '?') {
                num++;
            }
        }

        System.out.println("Количество предложений в строке - " + num);
    }
}
