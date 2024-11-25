// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.HashMap; // import the HashMap class
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        HashMap<String, Integer> items = new HashMap<String, Integer>();
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        while (input != 5) {
            System.out.println("=========================================");
            System.out.println("1) Add item");
            System.out.println("2) Check item quantity");
            System.out.println("3) Remove item");
            System.out.println("4) Print all items");
            System.out.println("5) Exit");
            System.out.print("Input: ");
            input = scanner.nextInt();
            // You must put a scanner.nextLine after nextInt() in order to consume the Enter character
            scanner.nextLine();
            switch(input) {
                case 1: {
                    // Setup
                    String itemName;
                    int itemQuantity;
                    System.out.print("Item name: ");
                    itemName = scanner.nextLine();
                    // Check if the item already exists
                    if (items.get(itemName) == null) {
                        System.out.print("Enter quantity: ");
                        itemQuantity = scanner.nextInt();
                        scanner.nextLine();
                        items.put(itemName, itemQuantity);
                        System.out.println("Added " + itemQuantity + " " + itemName);
                    } else {
                        System.out.println("Item already exists!");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Which item do you want to check?: ");
                    int index = 1;
                    for (String i : items.keySet()) {
                        System.out.println(index++ + ") " + i);
                    }
                    System.out.print("Input: ");
                    int _input = scanner.nextInt();
                    scanner.nextLine();
                    String itemName = items.keySet().toArray()[--_input].toString();
                    int itemQuantity = items.get(itemName);
                    System.out.println("Item " + itemName + " has a quantity of " + itemQuantity + ".");
                    break;
                }
                case 3: {
                    System.out.println("Which item do you want to remove?: ");
                    int index = 1;
                    for (String i : items.keySet()) {
                        System.out.println(index++ + ") " + i);
                    }
                    System.out.print("Input: ");
                    int _input = scanner.nextInt();
                    scanner.nextLine();

                    String itemName = items.keySet().toArray()[--_input].toString();
                    items.remove(itemName);
                    System.out.println("Item " + itemName + " has been removed.");
                    break;
                }
                case 4: {
                    for (String i : items.keySet()) {
                        System.out.println(i + ": " + items.get(i));
                    }
                }
            }
        }
    }
}