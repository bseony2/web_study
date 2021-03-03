package com.dto;

public class Dept {
    private int deptno;
    private String dname;
    private String loc;

    public String toString(){
        return "Dept [deptno = "+deptno+"dname = "+dname+"loc = "+loc+"]";
    }

    public Dept(){}
    public Dept(int no,String name, String loc){
        this.deptno =no;
        this.dname =name;
        this.loc = loc;
    }
    public int getDeptno() {
        return deptno;
    }
    public String getDname() {
        return dname;
    }
    public String getLoc() {
        return loc;
    }
    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }
    public void setLoc(String loc) {
        this.loc = loc;
    }
    public void setDname(String dname) {
        this.dname = dname;
    }
}