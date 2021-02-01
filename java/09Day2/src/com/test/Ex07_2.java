package com.test;

public class Ex07_2 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        Flyer bird2 = new Bird();
        bird2.fly();

        Airplane air = new Airplane();
        air.fly();
        Flyer air2 = new Airplane();
        air2.fly();

        Flyer arr[] = new Flyer[3];
        arr[0] = new Bird();
        arr[1] = new Airplane();
        arr[2] = new Bird();

        for(Flyer a : arr){
            a.fly();//오버라이딩 함수 호출
        }
    }
}
