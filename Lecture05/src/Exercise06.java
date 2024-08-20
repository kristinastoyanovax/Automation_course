/*
Write a Java program to calculate the average of a list of numbers.
 */
public class Exercise06 {
    public static void main(String[] args) {
        int[] array = {12, 15, 32, 42, 55};
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            sum = number + sum;
        }
        System.out.println("The average of an array of numbers is: " + (sum/array.length));


    }
}
