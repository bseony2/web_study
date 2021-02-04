package com.service;

import java.util.HashSet;
import com.dao.OracleDAO;

public class OracleService {

    OracleDAO dao;

    public OracleService(){
        dao = new OracleDAO();
    }

    public HashSet<String> select(){
        HashSet<String> xxx = dao.select();
        return xxx;
    }
    
}
