import com.dao.MySQLDAO;
import com.service.DBService;

public class DBMain {
    public static void main(String[] args) throws Exception {
        DBService service = new DBService();
        // oracleDAO 사용
        // service.ㅇDBDAO(new OracleDAO());
        // MySQLDAO 사용
        service.ㅇDBDAO(new MySQLDAO());
        service.insert();
    }
}
