import java.util.HashMap;
import java.util.Scanner;

/*
Tracking Inventory in a Store - Use a HashMap to manage a store's
inventory, where the product name is the key, and the quantity in stock is
the value:
• Add several products to the inventory with their quantities.
• Check the quantity of a specific product.
• Restock a product by increasing its quantity.
• Mark a product as out of stock by setting its quantity to zero.
• Remove a product from the inventory
• Print the entire inventory to see the stock levels.
 */
public class Exercise01 {
    public static void main(String[] args) {
        HashMap<String, Integer> inventory = new HashMap<>();
        Scanner scanner =new Scanner(System.in);

        inventory.put("Chairs", 22);
        inventory.put("Couches", 33);
        inventory.put("CoffeeTable", 44);
        inventory.put("TVs", 55);
        inventory.put("Toys", 66);


        System.out.print("Which product's quantity would you like to see? - ");
        String nameOfProduct = scanner.nextLine();
        System.out.println("The quantity for this product is: " + inventory.get(nameOfProduct));

        System.out.print("Choose a product to restock- ");
        nameOfProduct = scanner.nextLine();
        System.out.print("Enter a restock quantity - ");
        Integer quantityOfProduct = scanner.nextInt();
        scanner.nextLine();
        inventory.replace(nameOfProduct, inventory.get(nameOfProduct) + quantityOfProduct);
        System.out.println("Updated inventory:");
        for (String i : inventory.keySet()) {
            if (inventory.get(i) == 0) {
                System.out.println(i + " - Out of stock");
            }
            else {
                System.out.println(i + " - " + inventory.get(i));
            }
        }


        System.out.print("Choose a product to set as out of stock - ");
        nameOfProduct = scanner.nextLine();
        inventory.replace(nameOfProduct, 0);

        System.out.println("Updated inventory:");
        for (String i : inventory.keySet()) {
            if (inventory.get(i) == 0) {
                System.out.println(i + " - Out of stock");
            }
            else {
                System.out.println(i + " - " + inventory.get(i));
            }
        }

        System.out.print("Choose a product to remove from the list - ");
        nameOfProduct = scanner.nextLine();
        inventory.remove(nameOfProduct);

        System.out.println("Updated inventory:");
        for (String i : inventory.keySet()) {
            if (inventory.get(i) == 0) {
                System.out.println(i + " - Out of stock");
            }
            else {
                System.out.println(i + " - " + inventory.get(i));
            }
        }
    }
}
