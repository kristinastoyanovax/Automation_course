/*
Find the first multiple of 5 in an array of numbers.
 */
public class Exercise04 {
    public static void main(String[] args) {
        int[] array = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 20};
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if (number % 5 == 0) {
                System.out.println("First multiple of 5 is: " + number);
                break;
            }
        }
    }

}
