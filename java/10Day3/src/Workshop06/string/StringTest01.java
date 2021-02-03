package Workshop06.string;

import java.util.StringTokenizer;

public class StringTest01 {
    public static void main(String[] args) {
        String str = "I am second to none";

        char chararr[] = str.toCharArray();
        StringTokenizer st = new StringTokenizer(str, " ");
        int words = 0;int chars = 0;

        for(int i=0; i<chararr.length;i++){
            if(chararr[i] ==' '){
                continue;
            }
            System.out.print(chararr[i] + " ");
            chars++;
        }
        System.out.println("문자개수 : "+ chars);
        
        while(st.hasMoreElements()){
            words++;
        }
        

        System.out.println(chars);
    }
}
