public class Cake {
    String flavour;
    int layers;
    double price;

    //no-argument constructor
    public Cake(){
        this.flavour = "Vanilla";
        this.layers = 2;
        this.price = 23;
    }

    public void printDetails() {
        System.out.println(flavour);
        System.out.println(layers);
        System.out.println(price);
    }

    public double calcTotalPrice(double taxRate) {
        if(taxRate < 0) {
            System.out.println("Invalid tax rate");
            return  price;
        }

        double taxAmount = price * taxRate / 100;
        return price + taxAmount;
    }


}
