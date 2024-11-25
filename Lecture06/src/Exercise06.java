import java.util.LinkedList;
import java.util.Scanner;

/*
Create and manage a list of lottery numbers. This exercise allows users to
add lottery numbers, view the list of winning numbers, and check if a specific
number is a winning number
 */
public class Exercise06 {
    public static void main(String[] args) {
        LinkedList<Integer> lotteryNumbers = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        lotteryNumbers.add(6);
        lotteryNumbers.add(10);
        lotteryNumbers.add(57);
        lotteryNumbers.add(60);
        lotteryNumbers.add(80);

        System.out.printf("Enter a number: ");
        int lotteryNumber = scanner.nextInt();
        if (lotteryNumbers.contains(lotteryNumber)) {
            System.out.println("This is a winning number :)");
        }
        else {
            System.out.println("This is not a winning number :(");
        }
        System.out.println("The winning numbers are: " + lotteryNumbers);
    }
}
