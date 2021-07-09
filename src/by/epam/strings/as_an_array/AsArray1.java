package by.epam.strings.as_an_array;

// Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

public class AsArray1 {
    public static void main(String[] args) {
        String [] a = {"firstName", "secondName", "thirdName", "fourthName", "fifthName"};
        String [] newA = new String [a.length];

        for (int i = 0; i < a.length; i++) {
            newA[i] = String.valueOf(a[i].charAt(0));
            for ( int j = 1; j < a[i].length(); j++) {
                char letter = a[i].charAt(j);
                if ( (letter >= 'A') && (letter <= 'Z')) {
                    newA [i] = newA[i].concat("_");
                    newA [i] = newA[i].concat(String.valueOf((char) (letter | 32)));
                } else {
                    newA [i] = newA[i].concat(String.valueOf(letter));
                }
            }
        }

        for (String i: newA) {
            System.out.print(i + "\t");
        }
    }
}
