package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;

public class OracleDAO {

    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String user = "scott";
    String password = "tiger";

    public OracleDAO(){
        super();
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Dept> select() throws SQLException{ //dept 테이블 데이터 리턴
        ArrayList<Dept> list = new ArrayList<Dept>();
        Connection con = null;
        PreparedStatement pstmt = null; 
        ResultSet rs = null;
        con = DriverManager.getConnection(url, user, password);
        String sql = "select deptno, dname, loc from dept";
        pstmt = con.prepareStatement(sql);
        rs = pstmt.executeQuery();

        while(rs.next()){
            list.add(new Dept(rs.getInt("deptno"), rs.getString(2), rs.getString(3)));
        }
        if(rs != null) rs.close();
        if(pstmt != null) pstmt.close();
        if(con != null) con.close();

        return list;
    }

    public int insert(Dept data) throws SQLException{
        Connection con = null;
        PreparedStatement pstmt = null; 

        con = DriverManager.getConnection(url, user, password);
        String sql = "insert into dept values(?, ?, ?)";
        pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, data.getDeptno());
        pstmt.setString(2, data.getDname());
        pstmt.setString(3, data.getLoc());

        int result = pstmt.executeUpdate();
        if(pstmt != null) pstmt.close();
        if(con != null) con.close();

        return result;
    }

    public void delete(int no) throws SQLException{
        Connection con = null;
        PreparedStatement pstmt = null; 

        con = DriverManager.getConnection(url, user, password);
        String sql = "delete from dept where deptno = ?";
        pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, no);
        int result = pstmt.executeUpdate();
        System.out.println(result + "개의 데이터 삭제");
        if(pstmt != null) pstmt.close();
        if(con != null) con.close();
    }
}
