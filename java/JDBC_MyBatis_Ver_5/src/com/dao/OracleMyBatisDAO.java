package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleMyBatisDAO {
	// 1. 4가지 정보

	public OracleMyBatisDAO() {

	}

	public int deptRecordCount(SqlSession session) {
		int num= session.selectOne("com.dept.DeptMapper2.deptRecordCount");
		return num;
	}
	
	
	
	
	
	
	public void delete(SqlSession session, int deptno) {
		int num = session.delete("com.dept.DeptMapper.deptDelete", deptno);
		System.out.println("삭제된 갯수 ====" + num);
	}

	public Dept selectByDeptno(SqlSession session, int deptno) {
		Dept dept = session.selectOne("com.dept.DeptMapper.selectByDeptno", deptno);
		return dept;
	}

	public List<Dept> selectAll(SqlSession session) {
		// <select id="selectAll" resultType="com.dto.dept">
//		List<Dept> list= session.selectList("selectAll");
		List<Dept> list = session.selectList("com.dept.DeptMapper2.selectAll");
		return list;
	}

	public void insert(SqlSession session, Dept dept) {
		int num = session.insert("com.dept.DeptMapper.deptInsert", dept);
		System.out.println("추가된 레코드 ====" + num);
	}

	public void update(SqlSession session, Dept dept) {
		int num = session.update("com.dept.DeptMapper.deptUpdate", dept);
		System.out.println("업데이트 갯수====" + num);
	}

	
}
