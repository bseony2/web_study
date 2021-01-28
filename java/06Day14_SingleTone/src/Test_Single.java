import com.bank.Bank;

public class Test_Single {
    public static void main(String[] args) {
        Bank bank = Bank.getBank();

        System.out.println(bank);
        Bank bank1 = Bank.getBank();
        System.out.println(bank1);
        bank.setName("국민은행");
        System.out.println(bank1.getName());
        System.out.println(bank.getName());
    }
}
