import java.time.LocalDateTime;
import java.util.Scanner;
/*
public class Main {

    public static void main(String[] args) {
        displayTime();
    }



    public static void printGreeting() {
        System.out.println("Hello World!");
    }



    public static void displayTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);
    }



    public static void prepareMeal() {
        String mainDish = cookMainDish();
        String sideDish = prepareSideDish();
        System.out.println("Main dish: " + mainDish);
        System.out.println("Side dish: " + sideDish);
    }

    private static String prepareSideDish() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the main dish you want to cook: ");
        String sideDish = scanner.nextLine();
        System.out.println("Cooking the main dish: " + sideDish);
        return sideDish;
    }

    private static String cookMainDish() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the main dish you want to cook: ");
        String mainDish = scanner.nextLine();
        System.out.println("Cooking the main dish: " + mainDish);
        return mainDish;
    }
}
*/
public class Main {
    public static void main(String[] args) {
        printSquare(3);
    }
    public static void printSquare(int number) {
        int square = number * number;
        System.out.println("The square of " + number + " is " + square);
    }
}