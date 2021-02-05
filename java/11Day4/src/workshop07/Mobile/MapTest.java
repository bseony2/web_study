package workshop07.Mobile;

import java.util.HashMap;

public class MapTest {
    
    public static void main(String[] args) {
        HashMap<String, Mobile> map = new HashMap<String, Mobile>();
        double sum = 0.0;

        map.put("LU6800", new Mobile("SU7600", "Optimus 2X", 800000));
        map.put("SU6600", new Mobile("KU5700", "Optimus Black", 900000));
        map.put("KU5700", new Mobile("SU6600", "Optimus Big", 700000));
        map.put("SU7600", new Mobile("LU6800", "Optimus Mach", 950000));
        for(String key : map.keySet()){
            System.out.println(map.get(key).printInfo());
            sum += map.get(key).getPrice();
        }
        System.out.println("합계 : " + sum);

        for(String key : map.keySet()){
            map.get(key).setPrice(map.get(key).getPrice() * 1.1);
        }

        System.out.println("\n가격 변경 후");
        sum = 0;
        for(String key : map.keySet()){
            System.out.println(map.get(key).printInfo());
            sum += map.get(key).getPrice();
        }
        System.out.println("합계 : " + sum);

    }
}
