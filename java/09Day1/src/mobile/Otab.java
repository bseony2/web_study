package mobile;

public class Otab extends Mobile{

    public Otab(){}
    public Otab(String mobileName, int batterySize, String osType){
        super(mobileName, batterySize, osType);
    }

    public int operate(int time){
        setBatterySize(getBatterySize()-(time*10));
        return getBatterySize();
    }
    public int charge(int time){
        setBatterySize(getBatterySize()+(time*10));
        return getBatterySize();
    }
    public String showData(){
        return getMobileName() + "\t" + getBatterySize() + "\t" + getOsType();
    }
}
