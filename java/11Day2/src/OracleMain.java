import java.util.HashSet;

import com.service.OracleService;

public class OracleMain {
    public static void main(String[] args) throws Exception {
        OracleService service = new OracleService();

        HashSet<String> xxx= service.select(); //1번 작업, 5번 작업
    }
}
