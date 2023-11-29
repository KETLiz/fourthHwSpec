public class Main {
    public static void main(String[] args) {
        /**
         * Демонстрация работы дебетового счёта клиента
         */
//        DebitAccount d = new DebitAccount();
//        d.printBalance();
//        d.addAccountBalance();
//        try {
//            d.withdrawMoney();
//            d.addAccountBalance();
//            d.withdrawMoney();
//            d.addAccountBalance();
//        } catch (InsufficientFundsException e) {
//            System.out.print(e.getMessage());
//        }
        Transaction t = new Transaction();
        t.creditTransaction();
        t.debitTransaction();
        try {
            t.moneyTransaction();
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}