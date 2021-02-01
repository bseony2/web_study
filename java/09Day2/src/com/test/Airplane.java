package com.test;

public class Airplane implements Flyer{
    @Override
    public void takeOff() {
        System.out.println("Airplane 이륙=============");
    }

    @Override
    public void fly() {
        System.out.println("Airplane 날다=============");
    }

    @Override
    public void land() {
        System.out.println("Airplane 착륙=============");
    }
}
