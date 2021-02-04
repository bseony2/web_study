public class Person {

    private String name;
    private int age;
    private String address;

    

    public Person(){
        super();
    }
    public Person(String name, int age, String address){
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String toString(){
        return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
