import java.util.Scanner;
public class hello {
    public static void main(String[] args) {
        int [] score = {99, 34, 67, 22, 11, 9};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<score.length;i++){
            if(max<score[i])
                max = score[i];
            if(min>score[i])
                min = score[i];
        }
        System.out.println("최대값 : "+max);
        System.out.println("최소값 : "+ min);
    }
}
