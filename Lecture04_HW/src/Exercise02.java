import java.util.Scanner;

/*
Write a program to print the days of the week based on the user digit 1-7
input. The message should be “The [user input digit]-st/nd/rd/th day of the
week is [the day of the week]”
 */
public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayOfWeek = scanner.nextInt();
        if (dayOfWeek == 1) {
            System.out.println("The 1-st day of the week is Monday");
        } else if (dayOfWeek == 2) {
            System.out.println("The 2-nd day of the week is Tuesday");
        } else if (dayOfWeek == 3) {
            System.out.println("The 3-rd day of the week is Wednesday");
        } else if (dayOfWeek == 4) {
            System.out.println("The 4-th day of the week is Thursday");
        } else if (dayOfWeek == 5) {
            System.out.println("The 5-th day of the week is Friday");
        } else if (dayOfWeek == 6) {
            System.out.println("The 6-th day of the week is Saturday");
        } else if (dayOfWeek == 7) {
            System.out.println("The 7-th day of the week is Sunday");
        }
    }
}
