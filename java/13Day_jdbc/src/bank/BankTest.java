package bank;

public class BankTest {
    public static void main(String[] args) {
        Bank a = Bank.getBank();
        Bank b = Bank.getBank();

        System.out.println("a의 주소 : " + System.identityHashCode(a));
        System.out.println("b의 주소 : " + System.identityHashCode(b));
    }
    
}
