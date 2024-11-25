import java.util.Objects;
import java.util.Scanner;

/*
Write a program which advices the user where to go to a vacation based on the type of the
vacation and the budget. There should be two options – Beach, Mountain. If the user put a
different value then the program should print a message that there is no information about this
type of vacation. Budgets are considered per day per person. If the budget per day for Beach
type vacation is smaller than 50 then the program should advise Bulgaria as a destination,
otherwise Outside Bulgaria. If the budget per day for Mountain type vacation is smaller than 30
then the program should advise Bulgaria as a destination, otherwise Outside Bulgaria.
 */
public class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int budget = scanner.nextInt();
        if (Objects.equals(type, "Beach")) {
            if (budget < 50) {
                System.out.println("Bulgaria");
            } else {
                System.out.println("Outside Bulgaria");
            }
        } else if (Objects.equals(type, "Mountain")) {
            if (budget < 30) {
                System.out.println("Bulgaria");
            } else {
                System.out.println("Outside Bulgaria");
            }
        } else {
            System.out.println("There is no information about this type of vacation.");
        }
    }
}
