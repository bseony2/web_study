import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain {	
	public static void main(String[] args) {
		OracleMyBatisService service= new OracleMyBatisService();
		List<Dept> list= service.selectAll();
		//select * from dept where deptno > 90;
		for (Dept dept : list) {
			System.out.println(dept);
		}
		
		System.out.println("===================");
		
		
		
		
		
		
		
		
		
		
		
		List<Dept> list2= service.selectAll2();
		for (Dept dept : list2) {
			System.out.println(dept);
		}

	}

}
