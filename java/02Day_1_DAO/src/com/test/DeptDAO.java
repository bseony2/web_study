package com.test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeptDAO { // DB연동 클래스 - select, insert, delete, update

    static String driver = "oracle.jdbc.driver.OracleDriver";
    static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    static String userid = "scott";
    static String passwd = "tiger";

    public DeptDAO() { // 기본 생성자
        super();
        try {
            Class.forName(driver);
            System.out.println("드라이버 로딩 성공");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int insertDept(int no, String dname, String loc){
        Connection con = null;
        PreparedStatement pstmt = null;
        int rs = 0;

        try {
            con = DriverManager.getConnection(url, userid, passwd);
            String sql = "insert into dept(deptno, dname, loc) values(?, ?, ?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, no);
            pstmt.setString(2, dname);
            pstmt.setString(3, loc);
            rs = pstmt.executeUpdate();
            System.out.println("데이터 삽입 성공");
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(pstmt != null) pstmt = null;
                if(con != null) con = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Update : " + rs);
        return rs;
    }

    public void selectAllDept() {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection(url, userid, passwd);
            System.out.println(con);
            String sql = "select deptno x, dname, loc from dept";

            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while(rs.next()){
                int deptno = rs.getInt("x");
                String dname = rs.getString("dname");
                String loc = rs.getString("loc");
                System.out.println(deptno + "\t" + dname + "\t" + loc);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            try {
                if(rs != null) rs.close();
                if(pstmt != null) pstmt.close();
                if(con != null) con.close();
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }

    public void selectByDeptno(int deptno){
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, userid, passwd);
            String sql = "select * from dept where deptno = " + deptno;
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while(rs.next()){
                String dname = rs.getString("dname");
                String loc = rs.getString("loc");
                System.out.println(deptno + "\t" + dname + "\t" + loc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(rs != null) rs.close();
                if(pstmt != null) pstmt.close();
                if(con != null) con.close();
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
}
