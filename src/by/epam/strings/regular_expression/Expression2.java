package by.epam.strings.regular_expression;

// Дана строка, содержащая следующий текст (xml-документ):
//<notes>
//<note id = "1">
//<to>Вася</to>
//<from>Света</from>
//<heading>Напоминание</heading>
//<body>Позвони мне завтра!</body>
//</note>
//<note id = "2">
//<to>Петя</to>
//<from>Маша</from>
//<heading>Важное напоминание</heading>
//<body/>
//</note>
//</notes>
//Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип
// (открывающий тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения
// данной задачи нельзя.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expression2 {
    public static void main(String[] args) {
        String str = "<notes>" +
                "<note id=”1”>" +
                "<to>Вася</to>" +
                "<from>Света</from>" +
                "<heading>Напоминание</heading>" +
                "<body>Позвони мне завтра!</body>" +
                "</note>" +
                "<note id=”2”>" +
                "<to>Петя</to>" +
                "<from>Маша</from>" +
                "<heading>Важное напоминание</heading>" +
                "<body/>" +
                "</note>" +
                "</notes>";

        Pattern p = Pattern.compile("(<[.[^/]]*?>)|(</.*?>)|(<.*?/>)|([А-Яа-я ]+)");
        Matcher m = p.matcher(str);
        while(m.find()){
            if (m.group(1) != null) {
                System.out.println(m.group(1) + " - открывающий тег");
            } else if (m.group(2) != null) {
                System.out.println(m.group(2) + " - закрывающий тег");
            } else if (m.group(3) != null) {
                System.out.println(m.group(3) + " - тег без тела");
            } else if (m.group(4) != null) {
                System.out.println(m.group(4) + " - содержимое тега");
            } else {
                System.out.println("Неправильно введен вариант");
            }
        }
    }
}