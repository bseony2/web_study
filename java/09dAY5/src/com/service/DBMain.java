package testclass.service;

import testclass.dao.*;

public class DBMain {
    public static void main(String[] args) {
        DBService service = new DBService();

        service.setDAO(new OracleDAO());
        service.insert();

        service.setDAO(new MySQLDAO());
        service.insert();
    }
}
