package com.test;

abstract class MyClass{
    int num=3;

    public MyClass(){}
    public MyClass(int num){
        this.num = num;
    }
    public void methodA(){
        System.out.println("methodA");
    }
    public abstract void methodB();
}


class MyClassImple extends MyClass{

    public void print() {
        System.out.println(num);
    }
    @Override
    public void methodB(){
        System.out.println("methodB");
    }
}

public class Ex09_1 {

    public static void main(String[] args) {
        MyClass imp = new MyClassImple(); //다형성 적용
        ((MyClassImple)imp).print();
        imp.methodB();
    }
}