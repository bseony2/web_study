package workshop07;

import java.util.ArrayList;
import java.util.Random;

public class ListTest03 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        Random rd = new Random();

        for(int i=0; i<10;i++){
            list1.add(rd.nextInt(10));
            list2.add(rd.nextInt(10));
            try {
                System.out.printf("%d/%d %d\n", list1.get(i), list2.get(i), list1.get(i)/list2.get(i));
            } catch (ArithmeticException e) {
                System.out.printf("%d/%d 분모가 0입니다.\n", list1.get(i), list2.get(i));
            }
        }
    }
}
