package chapter1.oop;

// Example for encapsulation and data hiding.

public class Account {
    private int account_number;
    private int account_balance;

    public void showData() {
        System.out.println(account_balance);
    }

    public void deposit(int a) {
        if (a < 0) {
            System.out.println("Error");
        } else
            account_balance = account_balance + a;
    }
}

class Hacker {

    public static void main(String[] args) {
        Account account = new Account();
        //account.account_balance = -100;

        account.deposit(-100);

    }
}
