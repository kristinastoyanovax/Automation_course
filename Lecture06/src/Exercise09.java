import java.util.Stack;

/*
Use a Stack to simulate managing a stack of books. This exercise will involve
adding books to the stack, viewing the top book, and removing books from
the stack.
 */
public class Exercise09 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Book 1");
        stack.push("Book 2");
        stack.push("Book 3");
        stack.push("Book 4");
        stack.push("Book 5");

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
