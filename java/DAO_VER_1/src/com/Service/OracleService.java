package com.Service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.OracleDAO;
import com.dto.Dept;

public class OracleService {
    OracleDAO dao;

    public OracleService(){
        dao = new OracleDAO();
    }

    public ArrayList<Dept> select() throws SQLException{//dept 테이블 전체 레코드 리턴
        ArrayList<Dept> list = dao.select();//실제 db에서 데이터 꺼내는 함수
        return list;
    }

    public int insert(Dept data) throws SQLException {
        return dao.insert(data);
    }

    public void delete(int no) throws SQLException{
        dao.delete(no);
    }
    
}
