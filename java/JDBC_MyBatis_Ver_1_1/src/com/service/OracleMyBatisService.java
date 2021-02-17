package com.service;

import java.util.List;

import com.config.MySqlSessionFactory;
import com.dao.OracleMyBatisDAO;
import com.dto.Dept;

import org.apache.ibatis.session.SqlSession;

public class OracleMyBatisService {

    OracleMyBatisDAO dao;
    public OracleMyBatisService(){
        super();
        dao = new OracleMyBatisDAO();
    }

    public List<Dept> selectAll(){
        SqlSession session = MySqlSessionFactory.getSqlSession();
        List<Dept> list = null;
        try{
            list = dao.selectAll(session);
        }catch(Exception e){

        }finally{
            session.close();
        }
        return list;
    }
    
}
