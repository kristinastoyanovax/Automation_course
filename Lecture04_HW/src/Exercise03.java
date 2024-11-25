import java.util.Scanner;

/*
Write Java program to allow the user to input his/her age. Then the program
will show if the person is eligible to work. A person who is eligible to work
must be older than or equal to 16 years old.
 */
public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 16) {
            System.out.println("Person is eligible to work");
        } else {
            System.out.println("Person isn't eligible to work");
        }
    }
}
