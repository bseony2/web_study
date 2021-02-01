package mobile;

abstract public class Mobile {
    private String mobileName;
    private int batterySize;
    private String osType;

    public Mobile(){}
    public Mobile(String mobileName, int batterySize, String osType){
        this.mobileName = mobileName;
        this.batterySize = batterySize;
        this.osType = osType;
    }

    public String getMobileName() {
        return this.mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public int getBatterySize() {
        return this.batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public String getOsType() {
        return this.osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    abstract public int operate(int time);
    abstract public int charge(int time);
}
