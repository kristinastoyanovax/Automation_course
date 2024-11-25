import java.util.Scanner;
/*
Write a program that converts temperature between Celsius and
Fahrenheit. The user should be able to choose the direction of conversion.
The program should prompt the user to enter a temperature and then ask if
they want to convert from Celsius to Fahrenheit or Fahrenheit to Celsius.
Perform the conversion based on the user's choice and print the result.
Hint: use the formula: in the presentation
 */
public class Exercise07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String directionOfConversion = scanner.nextLine();

        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Convert to (1) Fahrenheit or (2) Celsius? Enter 1 or 2: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                double fahrenheit = (temperature * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                break;
            case 2:
                double celsius = (temperature - 32) * 5 / 9;
                System.out.println("Temperature in Celsius: " + celsius);
                break;
            default:
                System.out.println("Invalid input. Please enter 1 or 2.");
                break;
    }
}}
