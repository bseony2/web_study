import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Statement_InputTest {
    public static void main(String[] args) {
        String driver = "oracle.jdbc.driver.OracleDriver"; //드라이버
        String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 접속주소, sid
        String user = "scott";//스키마 id
        String password = "tiger";//패스워드

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(driver);
            System.out.println("====drive loading complete====");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("====Connection loading complete====");
            stmt = con.createStatement();

            int deptno = 99;
            String dname = "개발";
            String loc = "서울";
            String sql = "insert into dept(deptno, dname, loc) values("+deptno+ ", '개발'"+ ", '서울')";
            System.out.println(sql);

            int result = stmt.executeUpdate(sql);
            System.out.println("실행된 레코드 갯수 : " + result);

            String sql2 = "select deptno, dname, loc from dept";
            rs = stmt.executeQuery(sql2);
            while(rs.next()){
                System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            try {
                if(rs != null) rs.close();
                if(stmt != null) stmt.close();
                if(con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
