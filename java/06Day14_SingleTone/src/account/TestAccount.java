package account;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account("441-0290-1203", 500000, 7.3);
        System.out.println(account.printAccountInfo());
        account.withdraw(600000);
        account.deposit(20000);
        System.out.println(account.printAccountInfo());
        System.out.println(account.calculateInterest());
    }

}
