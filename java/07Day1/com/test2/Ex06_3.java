package com.test2;

class Employee{
    String name;
    int salary;
    public Employee(){}
    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public String getEmployee(){
        return name + "\t" + salary;
    }
}

class Manager extends Employee{
    String depart;
    public Manager(){}

    public Manager(String name, int salary, String depart){
        super(name, salary);
        this.depart = depart;
    }
    public Manager(String name, int salary){
        super(name, salary);
    }
    public String getManager(){
        // return name + "\t" + salary + "\t" + depart;
        return getEmployee() + "\t" + depart;
    }
}

public class Ex06_3 {
    public static void main(String[] args) {
        Manager man = new Manager("이순신", 400, "개발");
        System.out.println(man.getManager());
    }    
}
