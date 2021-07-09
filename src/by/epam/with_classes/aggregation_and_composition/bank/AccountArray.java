package by.epam.with_classes.aggregation_and_composition.bank;

// Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
// Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
// имеющим положительный и отрицательный балансы отдельно.

public class AccountArray {
    Account[] accountArray = new Account[3];

    public static void main(String[] args) {
        AccountArray array = new AccountArray();
        array.accountArray[0] = new Account(1, 1111, 50, true);
        array.accountArray[1] = new Account(2, 1112, -150, true);
        array.accountArray[2] = new Account(3, 1113, 370, true);

        array.accountArray[0].setCondition(false);
        array.sort();
        System.out.println("Сортировка счетов по балансу:");
        for (Account elem : array.accountArray) {
            System.out.println(elem.toString());
        }
        System.out.println("Баланс по всем активным счетам: " + array.totalSum() + " руб.");
        System.out.println("Сумма по счетам с положительным балансом: " + array.plusBalance() + " руб.");
        System.out.println("Сумма по счетам с отрицательным балансом: " + array.minusBalance() + " руб.");
    }

    public void sort() {
        int buf = accountArray[0].balance;
        for (int i = 0; i < accountArray.length; i++) {
            for (int j = 1; j < accountArray.length; j++) {
                if (accountArray[j].balance < buf) {
                    swap(j, j - 1);
                }
            }
        }
    }

    public int totalSum() {
        int sum = 0;
        for (Account elem : accountArray) {
            if (elem.condition) {
                sum += elem.balance;
            }
        }
        return sum;
    }

    public int plusBalance() {
        int sum = 0;
        for (Account elem : accountArray) {
            if (elem.balance > 0) {
                sum += elem.balance;
            }
        }
        return sum;
    }

    public int minusBalance() {
        int sum = 0;
        for (Account elem : accountArray) {
            if (elem.balance < 0) {
                sum += elem.balance;
            }
        }
        return sum;
    }

    public void swap (int x, int y) {
        Account buf = accountArray[x];
        accountArray[x] = accountArray[y];
        accountArray[y] = buf;
    }


}
