//Write program to print sum of a given array elements
public class Exercise01 {
    public static void main(String[] args) {
        int[] array = {5, 10, 12, 34, 56};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            sum = number + sum;
        }
        System.out.println("The sum of this array is: " + sum);
    }
}