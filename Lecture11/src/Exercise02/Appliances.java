package Exercise02;

public class Appliances {
    String brand;
    int powerConsumption;
    boolean isOn;

    public Appliances(String brand, int powerConsumption) {
        this.brand = brand;
        this.powerConsumption = powerConsumption;
    }

    public void turnedOn(){
        this.isOn = true;
        System.out.println(brand + " appliance is turned on.");
    }
    public void turnedOff(){
        this.isOn = false;
        System.out.println(brand + " appliance is turned off.");
    }
}
