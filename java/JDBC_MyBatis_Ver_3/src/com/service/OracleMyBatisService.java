package com.service;

import java.util.List;

import com.config.MySqlSessionFactory;
import com.dao.OracleMyBatisDAO;
import com.dto.Dept;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class OracleMyBatisService {

    OracleMyBatisDAO dao;
    public OracleMyBatisService(){
        super();
        dao = new OracleMyBatisDAO();
    }

	public List<Dept> selectAll() {
        SqlSession session = MySqlSessionFactory.getSqlSession();// connection과 비슷한 SqlSession
        List<Dept> list = null;
        try {
            list = dao.selectAll(session);//dao에서 사용할 SqlSession 넘기기
        } catch (Exception e) {
            //TODO: handle exception
        }finally{
            session.close();
        }
        
		return list;
	}

	public int insert(Dept dept){
        System.out.println("위쪽");
        SqlSession session = MySqlSessionFactory.getSqlSession();
        System.out.println("아래쪽");
        int num = 0;
        try{
            num = dao.insert(session, dept);
            session.commit(); //DML 사용시 명시적으로 꼭 명령해주어야 함
        }finally{
            session.close();
        }
        return num;
    }

    public Dept selectByDeptno(int deptno){
        SqlSession session = MySqlSessionFactory.getSqlSession();
        Dept dept = null;
        try{
            dept = dao.selectByDeptno(session, deptno);
        }finally{
            session.close();
        }
        return dept;
    }

    
    
}
