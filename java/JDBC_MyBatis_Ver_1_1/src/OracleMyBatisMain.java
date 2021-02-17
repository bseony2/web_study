import com.dto.Dept;
import com.service.OracleMyBatisService;
import java.util.List;

public class OracleMyBatisMain {
    public static void main(String[] args) {
        OracleMyBatisService service = new OracleMyBatisService();
        List<Dept> list = service.selectAll();
        for(Dept dept: list){
            System.out.println(dept);
        }
    }
}
