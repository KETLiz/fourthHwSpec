public class Main {
    public static void main(String[] args) {

        Transaction t = new Transaction();
        t.creditTransaction();
        t.debitTransaction();
        try {
            t.moneyTransaction();
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Что-то пошло не так :(");
        }
    }
}