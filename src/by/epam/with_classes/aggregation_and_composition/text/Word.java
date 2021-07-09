package by.epam.with_classes.aggregation_and_composition.text;

public class Word {
    String[] title;
    String[] text;

    {
        title = new String[] {"The ", "Little ", "Prince", "."};
        text = new String[] {"Once", "when", "I", "was", "six", "years", "old", "I", "saw", "a", "magnificent",
                "picture", "in", "a", "book", ",", "called", "True", "Stories", "from", "Nature", ",", "about", "the",
                "primeval", "forest", ".", "It", "was", "a", "picture", "of", "a", "boa", "constrictor", "int", "he",
                "act", "of", "swallowing", "an", "animal", "!", "Here", "is", "a", "copy", "of", "the", "drawing", "."};
    }

    public String readTitle(int i) {
        return title[i];
    }

    public String readText(int i) {
        return text[i];
    }

}
