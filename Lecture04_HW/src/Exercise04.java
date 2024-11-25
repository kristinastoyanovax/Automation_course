import java.util.Scanner;

/*
Write a Java program to calculate the revenue from a sale based on the unit price and
quantity of a product input by the user. The discount rate is 15% for the quantity
purchased between 100 and 120 units, and 20% for the quantity purchased greater than
120 units. If the quantity purchased is less than 100 units, the discount rate is 0%. See
the example output as shown below:
• Enter unit price: 25
• Enter quantity: 110
• The revenue from sale: 2337.5$
• Discount: 412.5 $(15.0%)
 */
public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float unitPrice = scanner.nextFloat();
        int quantity = scanner.nextInt();
        float discount = 0;
        if (quantity > 120) {
            discount = (float) (unitPrice * quantity * 0.20);
            System.out.println("Unit price: " + unitPrice);
            System.out.println("Quantity: " + quantity);
            System.out.println("The revenue from sale: " + ( (unitPrice * quantity) - discount) + "$");
            System.out.println("Discount: " + discount + " $(20.0%)" );
        } else if (100 <= quantity) {
            discount = (float) (unitPrice * quantity * 0.15);
            System.out.println("Unit price: " + unitPrice);
            System.out.println("Quantity: " + quantity);
            System.out.println("The revenue from sale: " + ( (unitPrice * quantity) - discount) + "$");
            System.out.println("Discount: " + discount + " $(15.0%)" );
        } else {
            System.out.println("Unit price: " + unitPrice);
            System.out.println("Quantity: " + quantity);
            System.out.println("The revenue from sale: " + ( (unitPrice * quantity) - discount) + "$");
            System.out.println("Discount: " + discount + " $(0.0%)" );
        }
    }
}
