import java.util.LinkedList;
import java.util.Scanner;

/*
Create and manage a simple contact list using LinkedList. This exercise
allows users to add contacts, view the list, and remove a contact
 */
public class Exercise07 {
    public static void main(String[] args) {
        LinkedList<String> contactList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        contactList.add("Alex");
        contactList.add("Zayn");
        contactList.add("Michael");
        contactList.add("Daniel");
        contactList.add("Daisy");
        contactList.add("Lucas");
        System.out.println("List of contacts:");
        for (int i = 0; i < contactList.size(); i++){
            System.out.println((i + 1) + ") " + contactList.get(i));
        }
        System.out.printf("Which contact you want to remove?");
        int contactNumber = scanner.nextInt();

        contactList.remove(contactNumber - 1);

        System.out.println("List of contacts: " + contactList);

    }
}
