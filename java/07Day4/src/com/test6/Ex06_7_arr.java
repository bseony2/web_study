package com.test6;

class Employee{
    String name;
    int salary;
    public String getEmployee(){
        return "Employee======"+name+"\t"+salary;
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
        return "Manager======"+super.getEmployee() + "\t" + depart;
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
    String address;

    public Engineer(String name, int salary, String address){
        super(name, salary);
        this.address = address;
    }

    public Engineer(){
        super();
    }

    @Override
    public String getEmployee(){
        return "Engineer ======"+super.getEmployee() + "\t"+address;
    }
}

public class Ex06_7_arr {
    public static void main(String[] args) {
        Employee[] emps = new Employee[4];
        emps[0] = new Employee("AA", 100);
        emps[1] = new Manager("bb", 11, "bb");
        emps[2] = new Engineer("cc", 22, "cc");
        emps[3] = new Manager("dd", 22, "dd");
        for(Employee e : emps){
            System.out.println(e.getEmployee()); //오버라이드 된 함수 호출
            if(e instanceof Manager){
                Manager m = (Manager)e;
                System.out.println("Manager임=======");
            }else if(e instanceof Engineer){
                Engineer en = (Engineer)e;
                System.out.println("Engineer임======");
            }else{
                System.out.println("Employee임======");
            }
        }
    }
    
}