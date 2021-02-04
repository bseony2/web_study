import java.util.ArrayList;
import java.util.Iterator;

public class ListTest2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("이순신");
        list.add("유관순");
        list.add("강감찬");
        list.add("세종");
        //list.add(100);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        for(String s : list){
            System.out.println(s);
        }
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
    
    
}
