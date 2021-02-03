package Workshop06.calc;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CalTest extends Calculator{
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] cal = br.readLine().split(" ");
        int a = Integer.parseInt(cal[0]); int b = Integer.parseInt(cal[2]);
        if (cal[1].equals("+")){
            System.out.println(plus(a, b));
        }else if (cal[1].equals("-")){
            minus(a, b);
        }else if (cal[1].equals("*")){
            System.out.println(multiplication(a, b));
        }else if(cal[1].equals("/")){
            try {
                System.out.println(divide(a, b));
            } catch (Exception e) {
                System.out.println("Exception이 발생 하였습니다. 다시 입력해 주세요");
            }
            
        }
    }

    
}
