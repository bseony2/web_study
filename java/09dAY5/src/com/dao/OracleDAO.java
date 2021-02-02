package testclass.dao;

public class OracleDAO implements DBDAO{
    @Override
    public void connect(){
        System.out.println("OracleDAO.connect=========");
    }
    @Override
    public void insert(){
        System.out.println("OracleDAO.insert==========");
    }
}
