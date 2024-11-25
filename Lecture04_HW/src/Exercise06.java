import java.util.Scanner;

/*
Write a program that asks the user to enter a year. Check if the year is a leap
year. A year is a leap year if it is divisible by 4 but not divisible by 100, except
when it is divisible by 400. Print "Leap year" or "Not a leap year" based on the
result. Hint: A leap year must be divisible by 4, and not divisible by 100 unless is
divisible by 400.
trqbwa das e deli na 4 i ne trqbwa da se deli na 100 ili trqbwa dase deli na 400
 */
public class Exercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
