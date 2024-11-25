//Find the biggest element of an array and print it in the console

public class Exercise04 {
    public static void main(String[] args) {
        int[] array = {5, 10, 12, 34, 56};
        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] >  maxNumber) {
                maxNumber = array[i];
            }
        }
        System.out.println("The biggest element is: " + maxNumber);
    }
}
