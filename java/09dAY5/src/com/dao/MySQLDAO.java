package testclass.dao;

public class MySQLDAO implements DBDAO {
    //db와 java언어 연동 - MyDBMS 연동하여 sql 실행하기 위한 클래스
    @Override
    public void connect() {
        System.out.println("MySQLDAO.connect=========");
    }
    @Override
    public void insert(){
        System.out.println("MySQLDAO.insert==========");
    }
}
