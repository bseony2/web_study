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

	public void insert(SqlSession session, Dept dept) {
        int num = session.insert("deptInsert", dept);//(id, 데이터)
        System.out.println("추가된 레코드 ===" + num);
	}

	public Dept selectByDeptno(SqlSession session, int deptno) {
		Dept dept = session.selectOne("selectByDeptno", deptno);
		return dept;
	}

	public int update(SqlSession session, Dept dept){
		int num = session.update("deptUpdate", dept);
		System.out.println("업데이트 갯수=====" + num);
		return num;
	}

	public void delete(SqlSession session, int deptno){
		int num = session.delete("deptDelete", deptno);
		System.out.println("삭제된 갯수==========" + num);
	}
    
}
