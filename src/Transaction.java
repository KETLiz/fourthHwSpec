import java.util.Scanner;

public class Transaction {
    CreditAccount credit;
    DebitAccount debit;
    Scanner sc = new Scanner(System.in);

    public Transaction() {
        credit = new CreditAccount();
        debit = new DebitAccount();
    }

    public int creditTransaction() {
        return credit.takeCredit();
    }

    public int debitTransaction() {
        return debit.addAccountBalance();
    }

    /**
     * Метод перевода денежных средств с дебетового счёта на кредитный
     * @throws InsufficientFundsException недостаточно средств на балансе
     */
    public void moneyTransaction() throws InsufficientFundsException {
        System.out.print("Введите сумму транзакции с дебетового счёта" +
                " на кредитный ");
        int payment = sc.nextInt();
        if(payment < 0) {
            throw new IllegalArgumentException("Что ты делаешь? Мне " +
                    "не нужны отрицательные платежи!");
        }
        if(payment > debit.getBalance()) {
            throw new InsufficientFundsException("Недостаточно средств");
        }
        if(payment > credit.getBalance()*(-1)) {
            int delta = credit.balance + payment; // переплата по кредиту
            credit.balance = 0; // кредит погашен
            debit.balance = debit.balance - payment + delta; // возврат остатка суммы платежа на дебетовый счёт
            System.out.printf("Баланс по кредиту равен %d\n" +
                    "Сумма переплаты %d рублей возвращена на дебетовый счёт\n" +
                    "Баланс дебетового счёта равен %d", credit.getBalance(), delta, debit.getBalance());
        } else {
            credit.balance += payment;
            debit.balance -= payment;
            System.out.printf("Перевод успешно выполнен!\n" +
                    "Баланс дебетового счёта равен %d\n" +
                    "Остаток по кредиту равен %d", debit.getBalance(), credit.getBalance());
        }
    }
}
