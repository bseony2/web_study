package Workshop06.acc;

public class Account {
	private String account;
	private double balance;
	private double interestRate;

	public Account() {
	}

	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public double calculateInterest() {
		return balance * interestRate;
	}

	public void deposit(double money) throws AccountException {
        if(money<0)
            throw new AccountException("입금 금액이 0보다 적습니다.");
        else
            balance += money;
	}

	public void withdraw(double money) throws AccountException{
		if(money<0 || money > balance){
            throw new AccountException("금액이 0보다 적거나 현재 잔액보다 많습니다.");
        }
    }
    
    public void printAccountInfo(){
        System.out.println("계좌정보 : " + getAccount() + " 현재잔액 : " + getBalance());
    }

    //getter & setter
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getBalance() {
		return balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}