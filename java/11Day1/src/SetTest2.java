import java.util.HashSet;
import java.util.Iterator;

public class SetTest2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("1");
        set.add("1");
        set.add("1");
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        set.add("6");

        System.out.println("set.toString==========" + set);

        for(String x: set){
            System.out.println(x);
        }

        Iterator<String>ite = set.iterator();
        while(ite.hasNext()){
            String m = ite.next();
            System.out.println(">>"+m);
        }

        Iterator<String> i = set.iterator();
        while(i.hasNext()){
            String data = i.next();
            if(data.equals("1")){
                System.out.println("================" + data);
            }
        }
    }
}
