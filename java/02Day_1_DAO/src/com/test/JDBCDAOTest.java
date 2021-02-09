package com.test;

public class JDBCDAOTest {
    public static void main(String[] args) {
        DeptDAO dao = new DeptDAO();
        dao.selectAllDept();
        // System.out.println(dao.insertDept(99, "QA", "부천"));
        System.out.println("deptno = 10 =============");
        dao.selectByDeptno(10);
        
    }
}
