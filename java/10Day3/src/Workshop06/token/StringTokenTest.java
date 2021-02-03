package Workshop06.token;
import java.util.StringTokenizer;

import java.io.IOException;

public class StringTokenTest{
    public static void main(String[] args) throws IOException{
        String str = "4,2,3,6,7";
        StringTokenizer st = new StringTokenizer(str, ",");
        int result = 0;
        while(st.hasMoreTokens()){
            result += Integer.parseInt(st.nextToken());
        }
        System.out.println(result);
    }
}