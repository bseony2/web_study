package com.test3;

public class test {
    public static void main(String[] args) {
        Employee e = new Employee("이순신", 200);
        System.out.println(e.getEmployee());
        Manager man = new Manager("홍길동", 100, "영업");
        System.out.println(man.getEmployee());

        Engineer en = new Engineer("aaa", 100, 200);
        String data = en.getEmployee();
        System.out.println(data);

        Employee eng1 = new Engineer("abc", 100, 300);
        System.out.println(eng1.getEmployee());

    }
}
