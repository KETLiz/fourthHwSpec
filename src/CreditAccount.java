public class CreditAccount extends Account {

    /**
     * Взять кредит
     * @return баланс кредитного счёта
     */
    public int takeCredit() {
        System.out.print("Введите сумму кредита, который хотите взять: ");
        balance = sc.nextInt();
        if(balance < 0) {
            throw new IllegalArgumentException("Ну нельзя просить " +
                    "отрицательный кредит!");
        }
        balance = -1*balance;
        System.out.println("Кредит одобрен! Баланс вашего счёта равен " + getBalance());
        return balance;
    }

}
