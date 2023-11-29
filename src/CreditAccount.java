public class CreditAccount extends Account {

    /**
     * Взять кредит
     * @return баланс кредитного счёта
     */
    public int takeCredit() {
        System.out.print("Введите сумму кредита, который хотите взять: ");
        balance = -1*sc.nextInt();
        System.out.println("Кредит одобрен! Баланс вашего счёта равен " + getBalance());
        return balance;
    }

}
