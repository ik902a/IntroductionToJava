package by.epam.algorithmization.matrix;

// Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
//..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//собой. Построить такой квадрат. Пример магического квадрата порядка 3:
//6 1 8
//7 5 3
//2 9 4

public class Matrix16 {
    public static void main(String[] args) {
        int n = 3;
        int length = n * n;
        int m[] = new int[length];

        int cursorA = length - 2;
        int cursorB;     // Указатели на числа, которые необходим тасовать
        int buf;         // Переменная для совершения перестановок

        int left;
        int right;       // Границы (left и right) части массива, которую необходимо дополнительно сортировать

        int sum;          // Переменная контрольной суммы для проверки последовательности чисел на магичность
        int check;        // Переменная для сумм, которые необходимо сверить с переменной sum для подтверждения
                          // магичности последовательности
        boolean logic;    // Условие для подтверждения магичности последовательности

        for (int i = 0; i < length; i++) {                       // Создаем массив
            m[i] = i + 1;
        }

        while (cursorA >= 0) {
            cursorA = length - 2;                                 // Устанавливаем курсор на вторую с конца позицию

            while (cursorA >= 0 && m[cursorA] >= m[cursorA + 1]) { // Двигаем курсор влево, если число справа меньше,
                                                                   // чем число на позиции обозначенной курсором
                cursorA--;
            }
            if (cursorA < 0) {                   // Если магических квадратов не найдено заканчиваем проверки
                break;
            }

            cursorB = length - 1;
            while (m[cursorA] >= m[cursorB]) { // Снова просматриваем массив справа налево и смещаем курсор влево,
                                               // пока не найдем новое число больше предыдущего отмеченного
                cursorB--;
            }
            buf = m[cursorB];                  // Меняем местами отмеченные позиции
            m[cursorB] = m[cursorA];
            m[cursorA] = buf;

            right = length - 1;
            left = cursorA + 1;
            while (left < right) {            // Отсортируем числа справа от первого курсора по возрастанию,
                buf = m[right];              // перевернув последовательность, т.к. до этого числа стояли по убыванию
                m[right] = m[left];
                m[left] = buf;
                right--;
                left++;
            }

            sum = 0;
            logic = true;
            for (int i = 1; i <= n; i++) {                       // Сумма побочной диагонали
                sum += m[(i * n) - i];
            }

            check = 0;
            for (int i = 0; i < n; i++) {                       // Проверяем сумму главной диагонали
                check += m[(i * n) + i];
            }
            if (sum != check) {
                logic = false;
            }

            for (int i = 0; logic && i < n; i++) {               // Проверяем суммы строк
                check = 0;
                for (int j = i * n; j < n + (i * n); j++) {
                    check += m[j];
                }
                if (sum != check) {
                    logic = false;
                    break;
                }
            }

            for (int i = 0; logic && i < n; i++) {                 // Проверяем суммы столбцов
                check = 0;
                for (int j = 0; j < n; j++) {
                    check += m[(j * n) + i];
                }
                if (sum != check) {
                    logic = false;
                    break;
                }
            }

            if (logic) {
                System.out.print("Магический квадрат");               // Выводим магический квадрат
                for (int i = 0; i < length; i++) {
                    if (i % n == 0) {
                        System.out.println();
                    }
                    System.out.print(m[i] + " ");
                }
                break;
            }
        }
    }
}
