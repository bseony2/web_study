import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain3 {

	public static void main(String[] args) {
		OracleMyBatisService service= new OracleMyBatisService();
		HashMap map = service.selectByDeptnoHashMap()
	}

}
