package mobile;

public class MobileTest {
    public static void main(String[] args) {
        Ltab ltab = new Ltab("Ltab", 500, "AP-01");
        Otab otab = new Otab("Otab", 1000, "AND-20");
        System.out.println("Mobile \t Battery \t OS");
        System.out.println("-----------------------------------");
        System.out.println(ltab.showData());
        System.out.println(otab.showData());

        ltab.charge(10);
        otab.charge(10);

        System.out.println();
        System.out.println("10분 충전");
        System.out.println("Mobile \t Battery \t OS");
        System.out.println("-----------------------------------");
        System.out.println(ltab.showData());
        System.out.println(otab.showData());

    }
}
