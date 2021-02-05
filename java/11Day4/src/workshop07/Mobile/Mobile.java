package workshop07.Mobile;

public class Mobile {
    private String code;
    private String name;
    private double price;
    
    public Mobile(){}
    public Mobile(String code, String name, double price){
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String printInfo(){
        return code + " " + name + " " + price;
    }

    public String getCode() {return this.code;}
    public void setCode(String code) {this.code = code;}
    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}
    public double getPrice() {return this.price;}
    public void setPrice(double price) {this.price = price;}
}
