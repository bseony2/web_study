package workshop07.ship;

public abstract class Ship {
    String shipName;
    int fuelTank;

    public Ship(){}
    public Ship(String shipName, int fuelTank){
        this.shipName = shipName;
        this.fuelTank = fuelTank;
    }
    public abstract void sail(int dist);
    public abstract void refuel(int fuel);
    public abstract void printShipInfo();

    public String getShipName() {
        return this.shipName;
    }
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }
    public int getFuelTank() {
        return this.fuelTank;
    }
    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

}
