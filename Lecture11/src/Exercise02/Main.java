package Exercise02;
/*
We need a system to manage household appliances with basic details like brand and power
consumption. Each appliance should have the ability to be turned on or off.
• Add Appliance and specific types of appliances, like washing machines and refrigerators
• Specific types should handle extra details such as load capacity and temperature settings
• Washing machines need to start a wash cycle if it’s turned on (ex. Print message in console)
• Refrigerators should set temperatures. Temperature must be in range 5 to -3. If the value is not
in rage the temperature must be set to 0.
The system should show both general and specific information for each appliance type.
Create object from each appliance type and demo the display of the general and specific information.
The demonstration must be performed using a variable type corresponding to the superclass(parent)
Hint: Use Inheritance
 */
public class Main {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine("samsung", 150, 9);
        washingMachine.turnedOn();
        washingMachine.startWashCycle();
        Refrigerator refrigerator = new Refrigerator("LG", 220);
        System.out.println(refrigerator.temperatureSetting);

    }
}
