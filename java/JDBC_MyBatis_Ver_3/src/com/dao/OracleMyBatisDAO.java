package com.dao;

import java.util.List;

import com.dto.Dept;

import org.apache.ibatis.session.SqlSession;

public class OracleMyBatisDAO {

	public List<Dept> selectAll(SqlSession session) {
        //<select id="selectAll" resultType="com.dto.dept">
        List<Dept> list = session.selectList("selectAll");//SqlSession에서 Mapper
		return list;
	}

	public int insert(SqlSession session, Dept dept) {
        int num = session.insert("deptInsert", dept);//(id, 데이터)
        System.out.println("추가된 레코드 ===" + num);
		return num;
	}

	public Dept selectByDeptno(SqlSession session, int deptno) {
		Dept dept = session.selectOne("selectByDeptno", deptno);
		return dept;
	}

    
}
