package by.epam.strings.as_an_object;

// С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

public class AsObject4 {
    public static void main(String[] args) {
        String inform = "информатика";
        String tort = "";

        tort = tort.concat(inform.substring(7, 8) + inform.substring(3, 5) + inform.substring(7, 8));
        System.out.println(tort);
    }
}
