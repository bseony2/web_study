import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ClassforNameTest {
    public static void main(String[] args) {
        String driver = "oracle.jdbc.driver.OracleDriver"; //드라이버
        String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 접속주소, sid
        String user = "scott";//스키마 id
        String password = "tiger";//패스워드

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName(driver);
            System.out.println("====drive loading complete====");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("====Connection loading complete====");
            String sql = "select deptno, dname, loc from dept order by 1 desc";
            pstmt = con.prepareStatement(sql);

            rs = pstmt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            try {
                if(rs != null) rs.close();
                if(pstmt != null) pstmt.close();
                if(con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
