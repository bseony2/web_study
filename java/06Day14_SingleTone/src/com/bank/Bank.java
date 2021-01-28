package com.bank;

public class Bank {
    private static Bank b = new Bank();
    private String name;
    private Bank(){}

    public static Bank getBank(){
        return b;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
