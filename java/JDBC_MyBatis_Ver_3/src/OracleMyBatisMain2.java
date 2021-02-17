

import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain2 {
    public static void main(String[] args) {
        OracleMyBatisService service = new OracleMyBatisService();
        int num = service.insert(new Dept(99, "개발", "강남"));
        System.out.println("업데이트 ======> " +num);
        Dept selectDept = service.selectByDeptno(99);
        System.out.println(selectDept);
        List<Dept> list = service.selectAll();
        for(Dept dept : list){
            System.out.println(dept);
        }
    }
    
}
