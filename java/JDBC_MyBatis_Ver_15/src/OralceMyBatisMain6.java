import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain6 {

	public static void main(String[] args) {
		OracleMyBatisService service= new OracleMyBatisService();
		//3.multi insert
		List<Dept> depts= Arrays.asList(new Dept(12,"aa","aa"), new Dept(13,"bb","bb"));
		//service.insert(new Dept(12,"aa","aa"));
		//service.insert(new Dept(13,"bb","bb"));
		service.multiInsert(depts);
		List<Dept> list = service.selectAll();
		for (Dept dept : list) {
			System.out.println(dept);
		}
	}

}
