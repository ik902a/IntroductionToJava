package by.epam.strings.as_an_object;

// В строке вставить после каждого символа 'a' символ 'b'.

public class AsObject2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("I have 5 apples, 17 plums, 2 pears, 10 bananas, 13 tangerines.");

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                str.insert(++i, 'b');
            }
        }

        System.out.println(str);
    }
}
