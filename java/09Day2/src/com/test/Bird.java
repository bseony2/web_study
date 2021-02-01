package com.test;

public class Bird implements Flyer{

    @Override
    public void takeOff() {
        System.out.println("Bird 이륙=============");
    }

    @Override
    public void fly() {
        System.out.println("Bird 날다=============");
    }

    @Override
    public void land() {
        System.out.println("Bird 착륙=============");
    }
    
}
