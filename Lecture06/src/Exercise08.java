import java.util.PriorityQueue;
import java.util.Queue;

/*
Use a Queue to simulate managing a line of customers at a coffee shop. This
exercise will involve adding customers to the queue, serving them (removing
from the queue), and viewing the current line.
 */
public class Exercise08 {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(12);
        queue.add(2);
        queue.add(1);
        queue.add(22);
        queue.add(11);

        while (!queue.isEmpty()){
            queue.remove();
            System.out.println("Remaining line: " + queue);
        }
    }
}
