import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

/*
Get a book from a pile of 5 books stacked on top of each other. This exercise
involves adding books to the stack, searching for a specific book by title,
retrieving it, and printing the remaining books in the stack.
 */
public class Exercise10 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        stack.push("Book 1");
        stack.push("Book 2");
        stack.push("Book 3");
        stack.push("Book 4");
        stack.push("Book 5");

        System.out.printf("Which book do you want? ");
        String nameOfBook = scanner.nextLine();
        while (!stack.isEmpty() && !Objects.equals(stack.peek(), nameOfBook)) {
            stack.pop();
        }
        if (stack.isEmpty()){
            System.out.println("We don't have this book");
        }
        else {
            System.out.println("We have this book");
        }
        System.out.println("Remaining books: " + stack);
    }
}
