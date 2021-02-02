package testclass.service;

import testclass.dao.DBDAO;

import testclass.dao.*;

public class DBService {
    DBDAO dao;

    public void setDAO(DBDAO dao){
        this.dao = dao;
        this.dao.connect();
    }
    
    public void insert(){
        dao.insert();
    }
}
