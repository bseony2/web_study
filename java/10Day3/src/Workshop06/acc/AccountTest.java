package Workshop06.acc;

public class AccountTest {
    public static void main(String[] args) {
        Account account;
        account = new Account("441-0290-1203", 500000, 0.073);
        account.printAccountInfo();
        try {
            account.deposit(-10);
        } catch (AccountException e) {
            System.out.println("예외발생 : " + e.getMessage());
        }
        try {
            account.withdraw(600000);
        } catch (AccountException e) {
            System.out.println("예외발생 : " + e.getMessage());
        }
        
		System.out.println("이자 : " + account.calculateInterest());
	}
}