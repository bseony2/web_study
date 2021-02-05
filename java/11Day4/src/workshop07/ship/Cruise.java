package workshop07.ship;

public class Cruise extends Ship{
    public Cruise(){super();}
    public Cruise(String shipName, int fuelTank){
        super(shipName, fuelTank);
    }

    public void sail(int dist){
        fuelTank -= (dist * 13);

    }
    public void refuel(int fuel){
        fuelTank += (fuel * 8);
    }

    public void printShipInfo(){
        System.out.println(shipName + "\t" + fuelTank);
    }
}
