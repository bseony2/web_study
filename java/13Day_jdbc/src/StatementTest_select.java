import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTest_select {
    public static void main(String[] args) throws Exception {
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String userid = "scott";
        String passwd = "tiger";
        Connection con = null; //db접속 객체 - url, id, passwd필요
        //PreparedStatement pstmt = null; //sql실행 객체 con을 통해 생성
        Statement stmt = null; //sql실행객체 con을 통해 생성
        ResultSet rs = null; //시;ㄹ행된  sql문의 select 결과를 ResultSet객체에 담음
        try {
            Class.forName(driver);
            System.out.println("드라이버 로딩 성공 ===========");
            con = DriverManager.getConnection(url, userid, passwd);
            //getConnection(주소, 스키마아이디, 패스워드)
            System.out.println("connection 성공============ " + con);
            String sql = "select deptno x, dname, loc from dept";
            //sql 작성 : 문자여롤 작성, developer 사용 ,  sql 사용, ;사용 안함

            stmt = con.createStatement();
            System.out.println("stmt 생성 성공===========");
            rs = stmt.executeQuery(sql);
            System.out.println("결과얻기 rs==========");
            while(rs.next()){
                int deptno = rs.getInt("x");
                String dname = rs.getString("dname");
                String loc = rs.getString("loc");
                System.out.println(deptno + "\t" + dname + "\t" + loc);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}

