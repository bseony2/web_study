import java.sql.SQLException;
import java.util.ArrayList;

import com.Service.OracleService;
import com.dto.Dept;

public class OracleMain {

    public static void main(String[] args) {
        OracleService service = new OracleService();

        Dept xx = new Dept(99, "영업", "서울");
        try {
            int result = service.insert(xx);
            System.out.println("업데이트된 데이터 : " + result);
        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }


        try {
            service.delete(99);
        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }


        try {
            ArrayList<Dept> list = service.select();
            for(int i=0; i<list.size();i++){
                System.out.println(list.get(i));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } // dept 테이블의 전체 레코드를 메인 리턴 받음
    }
}