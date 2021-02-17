package com.dao;

import java.util.List;

import com.dto.Dept;

import org.apache.ibatis.session.SqlSession;

public class OracleMyBatisDAO {
    
    public List<Dept> selectAll(SqlSession session){
        List<Dept> list = session.selectList("selectAll");
        return list;
    }

}
