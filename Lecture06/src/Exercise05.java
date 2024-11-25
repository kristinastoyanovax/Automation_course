import java.util.ArrayList;

/*
Create a to-do list and manage tasks with the ability to add new tasks, mark
tasks as completed, remove completed tasks, and display the current list.
 */
public class Exercise05 {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        toDoList.add("Wash your hair");
        toDoList.add("Brush your teeth");
        toDoList.add("Wash the dishes");
        toDoList.add("Clean the carpet");
        toDoList.add("Fix the handle");
        toDoList.add("Make coffee");

        toDoList.set(1, toDoList.get(1) + " - COMPLETED");
        toDoList.set(2, toDoList.get(2) + " - COMPLETED");

        toDoList.remove(3);

        System.out.println("Current list contains: " + toDoList);


    }
}
