import java.util.Arrays;
import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain5 {

	public static void main(String[] args) {
		OracleMyBatisService service= new OracleMyBatisService();
//		2.Multiupdate
		List<Integer> deptnoes2= Arrays.asList(12,13,50);
		service.multiUpdate(deptnoes2);
		
		List<Integer> deptnoes= Arrays.asList(12,13,50);
//		System.out.println(deptnoes);
	
		List<Dept> list= service.multiSelect(deptnoes);
		for (Dept dept : list) {
			System.out.println(dept.getDeptno()+"\t"+"\t"+
		dept.getLoc());
		}
	}

}
