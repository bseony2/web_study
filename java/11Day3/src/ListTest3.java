import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest3 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("이순신");
        list.add("유관순");
        list.add("강감찬");
        list.add("세종");

        System.out.println("길이(크기)" + list.size());
        System.out.println("값 포함여부" + list.contains("세종"));
        System.out.println("특정값 위치" + list.indexOf("세종"));
        System.out.println("값이 없냐" + list.isEmpty());

        System.out.println(list);
        System.out.println("===========");

        List<String> sub = list.subList(0, 3);
        for(String x : sub){
            System.out.println("--------" + x);
        }

        System.out.println("sub>>" + sub);

        Object[] obj = list.toArray();
        for(Object x : obj){
            System.out.println("***" + x);
        }
    }
    
    
    
}
