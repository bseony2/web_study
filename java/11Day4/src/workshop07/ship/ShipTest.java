package workshop07.ship;

import java.util.ArrayList;

public class ShipTest {
    public static void main(String[] args) {
        ArrayList<Ship> list = new ArrayList<Ship>();
        list.add(new Boat("Boat01", 500));
        list.add(new Cruise("Cruise01", 1000));

        System.out.println("ShipName\tfuelTank");
        System.out.println("------------------------------");
        for(int i=0; i<list.size();i++){
            list.get(i).printShipInfo();
        }

        System.out.println();

        System.out.println("ShipName\tfuelTank");
        System.out.println("------------------------------");
        for(int i=0; i<list.size();i++){
            if(list.get(i) instanceof Boat){// 보트일경우 10운항
                list.get(i).sail(10);
                list.get(i).printShipInfo();
            }
            else if(list.get(i) instanceof Cruise){ //크루즈일 경우 
                list.get(i).sail(15);
                list.get(i).printShipInfo();
            }
        }

        System.out.println();

        System.out.println("ShipName\tfuelTank");
        System.out.println("------------------------------");
        for(int i=0; i<list.size();i++){
            if(list.get(i) instanceof Boat){// 보트일경우 10운항
                list.get(i).refuel(20);
                list.get(i).printShipInfo();
            }
            else if(list.get(i) instanceof Cruise){ //크루즈일 경우 
                list.get(i).refuel(30);
                list.get(i).printShipInfo();
            }
        }
    }
    
}
