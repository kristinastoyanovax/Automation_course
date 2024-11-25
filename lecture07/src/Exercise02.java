import java.util.HashSet;
import java.util.Scanner;

/*
2. Unique Guest List for a Party - Use a HashSet to manage a list of unique
guests for a party:
• Add several guest names to the list.
• Attempt to add a duplicate name and observe that it doesn’t get added
again.
• Remove a guest who can’t attend the party.
• Check if a specific person is on the guest list.
• Print all the guest names to see who is attending.
 */
public class Exercise02 {
    public static void main(String[] args) {
        HashSet<String> partyGuestNames = new HashSet<>();
        Scanner scanner  = new Scanner(System.in);

        //Add several guest names to the list.
        partyGuestNames.add("Daniel");
        partyGuestNames.add("Georgi");
        partyGuestNames.add("Alex");
        partyGuestNames.add("Michael");
        partyGuestNames.add("Tim");

        //Print all the guest names to see who is attending.
        System.out.println("List of guests:");
        for(String name : partyGuestNames) {
            System.out.println(name);
        }

        //Attempt to add a duplicate name and observe that it doesn’t get added again.
        partyGuestNames.add("Tim");
        System.out.println("List of guests:");
        for(String name : partyGuestNames) {
            System.out.println(name);
        }

        // Remove a guest who can’t attend the party.
        System.out.print("Enter a name to remove from the guests - ");
        String nameOfGuest = scanner.nextLine();
        partyGuestNames.remove(nameOfGuest);
        System.out.println("Updated list of guests:");
        for(String name : partyGuestNames) {
            System.out.println(name);
        }

        //Check if a specific person is on the guest list.
        System.out.println("Check if a person is on the guest list");
        System.out.print("Enter name: ");
        nameOfGuest = scanner.nextLine();
        if (partyGuestNames.contains(nameOfGuest)) {
            System.out.println("This person is on the guest list.");
        }
        else {
            System.out.println("This person is not on the guest list.");
        }

        //Print all the guest names to see who is attending.
        System.out.println("Final list of guests:");
        for(String name : partyGuestNames) {
            System.out.println(name);
        }
    }
}
