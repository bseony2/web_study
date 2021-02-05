package workshop07.ship;

public class Boat extends Ship{
    public Boat(){super();}
    public Boat(String shipName, int fuelTank){
        super(shipName, fuelTank);
    }

    public void sail(int dist){
        fuelTank -= (dist *10);
    }
    public void refuel(int fuel){
        fuelTank += (fuel * 10);
    }
    public void printShipInfo(){
        System.out.println(shipName + "\t\t" + fuelTank);
    }
}
