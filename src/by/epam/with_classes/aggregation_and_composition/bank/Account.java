package by.epam.with_classes.aggregation_and_composition.bank;

// Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
// Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
// имеющим положительный и отрицательный балансы отдельно.

public class Account {
    int id;
    int accountNum;
    int balance;
    boolean condition;

    public Account(int id, int accountNum, int balance, boolean condition){
        this.id = id;
        this.accountNum = accountNum;
        this.balance = balance;
        this.condition = condition;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public int getId() {
        return id;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return getAccountNum() + "| " + getBalance() + " руб.";
    }
}
