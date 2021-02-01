package com.test;

public interface Flyer {
    public abstract void takeOff(); //추상함수 선언
    public abstract void fly(); //추상함수 선언
    public void land(); //추상함수 선언 = 자동 abstract 추가
}
