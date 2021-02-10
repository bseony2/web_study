import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Statement_Insert_2 {
    public static void main(String[] args) {
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "tiger";

        Connection con = null;
        Statement stmt = null;

        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            String sql = "insert into dept (deptno, dname, loc)" + "values ("+13+",'개발', '서울')";

            stmt = con.createStatement();
            int num = stmt.executeUpdate(sql);

            String sql2 = "insert into dept (deptno, dname, loc)" + "values ("+14+",'개발2', '서울2')";
            int num2 = stmt.executeUpdate(sql2);

            System.out.println("실행된 레코드 갯수 : " + (num + num2));
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                if(stmt!=null) stmt.close();
            if(con!=null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
