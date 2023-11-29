import java.util.Scanner;

public abstract class Account {
    protected int balance;
    Scanner sc = new Scanner(System.in);

    public int getBalance() {
        return balance;
    }

}
