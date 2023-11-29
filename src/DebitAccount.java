import java.util.Scanner;

public class DebitAccount extends Account {
    /**
     * Метод внесения наличных денег на счёт
     * @return итоговую сумму на счёте
     */
    public int addAccountBalance() {
        System.out.print("Внесите деньги: ");
        int cash = sc.nextInt();
        if(balance == 0) {
            if(cash < 0) {
                throw new IllegalArgumentException("Вы не можете внести отрицательную сумму");
            }
            balance = cash;
        } else {
            if (cash < 0) {
                throw new IllegalArgumentException("Вы не можете внести отрицательную сумму");
            }
            balance += cash;
        }
        System.out.printf("Вы внесли %d рублей\nБаланс вашего лицевого счёта " +
                "равен %d рублей", cash, balance);
        System.out.println();
        return balance;
    }

    /**
     * Печать остатка денег на счёте
     */
    public void printBalance() {
        System.out.println("Баланс лицевого счёта равен " + getBalance());
    }

    /**
     * Метод снятия наличных со счёта
     * @return остаток на счёте после снятия наличных
     * @throws InsufficientFundsException недостаточно денег на счёте
     */
    public int withdrawMoney() throws InsufficientFundsException {
        System.out.print("Введите сумму, которую хотите снять: ");
        int cash = sc.nextInt();
        if(cash > balance) {
            throw new InsufficientFundsException("Недостаточно средств на балансе");
        }
        if(cash < 0) {
            throw new IllegalArgumentException("Вы не можете снять отрицательную сумму");
        }
        balance -= cash;
        System.out.printf("Вы сняли %d рублей\nОстаток на счёте равен %d", cash, balance);
        System.out.println();
        return balance;
    }
}
