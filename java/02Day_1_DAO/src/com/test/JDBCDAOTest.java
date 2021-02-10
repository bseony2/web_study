package com.test;

import java.util.ArrayList;

public class JDBCDAOTest {
    public static void main(String[] args) {
        DeptDAO dao = new DeptDAO();
        // dao.selectAllDept();
        // // System.out.println(dao.insertDept(99, "QA", "부천"));
        // System.out.println("deptno = 10 =============");
        // dao.selectByDeptno(10);

        ArrayList<DeptDTO> dto = dao.getAllData();
        for(int i=0; i<dto.size();i++){
            System.out.println(dto.get(i).getDeptno() + "\t" + dto.get(i).getDname() + "\t" + dto.get(i).getLoc());
        }
        
    }
}