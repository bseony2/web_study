package com.test5;
class Employee{
    public void taxRate(Employee e){
        if(e instanceof Manager){ //부모->자식 순 비교하지 말고 자식->부모순
            ((Manager) e).print();
            Manager m=(Manager)e;
            System.out.println("Manager세금 구하기");
        }else if(e instanceof Engineer){
            ((Engineer)e).test();
            Engineer en=(Engineer)e;
            System.out.println("Engineer 세금구하기");
        }else if(e instanceof Employee){
            System.out.println("employee 세금구하기");
        }
    }
}

class Manager extends Employee{
    public void print(){
        System.out.println("Manager.print()========================");
    }
}
class Engineer extends Employee{
    public void test(){

    }
}

public class Ex06_8 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Manager man = new Manager();
        Engineer eng = new Engineer();
        //emp.taxRate(emp);
        emp.taxRate(man);
        //emp.taxRate(eng);

}
    
}