class Employee{
    String name;
    int salary;
    public String getEmployee(){
        System.out.println("Employee getEmployee()============");
        return name+"\t"+salary;
    }
    public Employee(String name, int salary){
        super();
        this.name = name;
        this.salary = salary;
    }
    public Employee(){
        super();
    }
}

class Manager extends Employee{
    String depart;

    public Manager(){
        super();
    }
    public Manager(String name, int salary, String depart){
        super(name, salary);
        this.depart = depart;
    }
    public Manager(String name, int salary){
        super(name, salary);
    }
    @Override
    public String getEmployee(){
        return super.getEmployee() + "\t" + depart;
    }
    public void print(){
        System.out.println("Manager.print()=================");
    }
    public String getDepart(){
        return depart;
    }
    public void setDepart(String depart){
        this.depart = depart;
    }
}

class Engineer extends Employee{
    int bonus;

    public Engineer(String name, int salary, int bonus){
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public String getEmployee(){
        return name + "\t" + salary + "\t" + bonus;
    }
}

public class Ex06_7 {
    public static void main(String[] args) {
    Employee e = new Employee("홍길동", 100);
    System.out.println(e.getEmployee());
    Manager m1 = new Manager("AA", 200, "서울");
    System.out.println(m1.getEmployee());
    Employee a = new Manager("aa", 1, "제주");
    System.out.println(a.getEmployee());
    //String loc = a.getDepart(); 컴파일 에러 : 타입이 부모 타입으러 선언 => getDepart() 사용불가
}
    
}