import java.util.Date;
import java.util.Set;
import java.util.HashSet;

public class SetTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("1");
        set.add("2");
        set.add(3);
        set.add("4");
        set.add(3.15);
        set.add(new Date());
        set.add(new Date());

        System.out.println("길이 : " + set.size());
        System.out.println("포함여부 : " + set.contains(3));
        System.out.println("empty냐 : " + set.isEmpty());

        System.err.println(set.remove("홍길동"));

        Object [] xxx = set.toArray();
        for(Object o : xxx){
            System.out.println(">>>"+o);
        }
        System.out.println(set);
        set.clear();
        System.out.println(set);
    }
}
