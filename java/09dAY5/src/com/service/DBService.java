package com.service;

import com.dao.DBDAO;
import com.dao.MySQLDAO;

public class DBService {

    DBDAO dao;//기본값 null
    
    public void setDAO(DBDAO dao){ //매개변수 interface 타입
        this.dao = dao;
        this.dao.connect();
    }
    
    public void insert(){
        dao.insert();
    }
}
