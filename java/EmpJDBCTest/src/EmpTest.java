


import java.util.ArrayList;

import com.biz.EmpBiz;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;




public class EmpTest {

	
	public static void main(String[] args) {
		
		EmpBiz empBiz = new EmpBiz();
		EmpDTO emp = new EmpDTO();
		emp.setEmpno(40);
		emp.setJob("테스트");
		emp.setSal(100);
		try {
			empBiz.empUpdate(emp);
			EmpDTO e= empBiz.selectDetailEmp("40");
			System.out.println(e);
		} catch (DataNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		ArrayList<EmpDTO> list = empBiz.selectAllEmp();
//		for (EmpDTO dto : list) {
//			System.out.println(dto);
//		}
	}//end main
}//end class
