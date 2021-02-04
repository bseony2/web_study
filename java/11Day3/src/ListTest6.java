import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ListTest6 {
    public static void main(String[] args) {
        ArrayList<Integer> set = new ArrayList<Integer>();
        set.add(9);
        set.add(6);
        set.add(1);
        set.add(3);
        set.add(4);

        System.out.println("정렬 전 : " + set);
        Collections.sort(set);
        System.out.println("정렬 후 : " + set);
        System.out.println("정렬 전 : " + set);
        Collections.reverse(set);
        System.out.println("정렬 전 : " + set);
    }
}
