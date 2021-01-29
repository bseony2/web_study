package com.test3;

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

    public Manager(String name, int salary, String depart){
        super(name, salary);
        this.depart = depart;
    }
    @Override
    public String getEmployee(){
        return super.getEmployee() + "\t" + depart;
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

public class Ex06_6 {

    
}