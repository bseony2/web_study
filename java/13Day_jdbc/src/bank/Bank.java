package bank;

public class Bank {
    String name;

    private static Bank b = new Bank();
    private Bank(){}

    public static Bank getBank(){
        return b;
    }

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    }
    

