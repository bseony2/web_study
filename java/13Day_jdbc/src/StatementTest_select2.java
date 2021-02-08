import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTest_select2 {
    public static void main(String[] args) {
        String driver = "oracle.jdbc.driver.OracleDriver"; //드라이버
        String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 접속주소, sid
        String user = "scott";//스키마 id
        String password = "tiger";//패스워드

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String sql = "select deptno, dname, loc from dept";
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                int deptno = rs.getInt("deptno");
                String dname = rs.getString("dname");
                String loc = rs.getString("loc");
                System.out.println(deptno + "\t" + dname + "\t" + loc);
            }
        } catch(SQLException e){
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
