/*
Print each number from an array of numbers by skipping numbers that multiples of 3
 */
public class Exercise05 {
    public static void main(String[] args) {
        int[] array = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 20};
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if (number % 3 == 0) {
                continue;

            }
            System.out.println(number);
        }
    }

}
