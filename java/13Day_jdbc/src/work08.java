import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class work08 {
    public static void main(String[] args) throws SQLException {
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String pwd = "tiger";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "";

        Scanner scan = new Scanner(System.in);
        System.out.print("매출 조회 메뉴 [매출 일자순 :1 ,상품별 매출 순 :2] :");
        int menu = scan.nextInt();

        if (menu == 1) {
            sql = "select to_char(ODATE,'YYYY-MM-DD') 영업일, SUM(O.QUANTITY*P.PRICE) 매출 "
                    + "from d7_order o join d7_product p using(pid) group by odate order by 1";
        }
        if (menu == 2) {
            sql = "select to_char(ODATE,'YYYY-MM-DD) , SUM(O.QUANTITY*P.PRICE) 매출"
                    + "from d7 order o join d7_product p using(pid) group by odate order by 1 desc";
        }
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pwd);
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            System.out.println("--------------------------");
            System.out.println((menu==1)?"영업일": "상품명"+"\t\t"+"매출");
            System.out.println("—————————————");

            while(rs.next()){
                System.out.println(rs.getString(1)+"\t\t"+rs.getString(2));
            }
        System.out.println("—————————————");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            if(rs!= null) rs.close();
            if(stmt!= null) stmt.close();
            if(con!= null) con.close();
        }
        
    }
}