package Exercise02;

public class WashingMachine extends Appliances {
    int loadCapacity;

    public WashingMachine(String brand, int powerConsumption, int loadCapacity) {
        super(brand, powerConsumption);
        this.loadCapacity = loadCapacity;
    }

    public void startWashCycle(){
       if (super.isOn) {
           System.out.println("Wash cycle started");
       }
    }
}
