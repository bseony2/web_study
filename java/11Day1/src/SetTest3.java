import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest3 {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<Person>();
        Person kkkk = new Person("유관순", 17, "서울");
        set.add(kkkk);
        set.add(kkkk);
        set.add(kkkk);
        set.add(new Person("홍길동", 20, "서울"));
        set.add(new Person("이순신", 44, "전라"));
        set.add(new Person("이순신", 44, "전라"));

        System.out.println(set.size());
        System.out.println(set);

        Iterator<Person> ite = set.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next().getName());
        }

        for(Person x : set){
            System.out.println(x.getName());
        }
    }
}
