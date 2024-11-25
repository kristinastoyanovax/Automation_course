import java.util.InputMismatchException;
import java.util.Scanner;

/*
Handling User Input Errors - create a program that prompts the user to
enter an integer. Use a try-catch block to handle situations where the user
enters something other than an integer (e.g., a letter or symbol). If an error
occurs, display a friendly error message and prompt the user to try again.
 */
public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int number = scanner.nextInt();
            System.out.println(number);
        }
        catch (InputMismatchException error) {
            System.out.println("Try again");
        }
    }
}
