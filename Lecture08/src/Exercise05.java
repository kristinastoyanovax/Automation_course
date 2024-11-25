//Write a Java method to find the second-largest number in an array of integers.
public class Exercise05 {
    public static void main(String[] args) {
        int[] array = {1,3,6,5,8};
        int number = getSecondLargestNumber(array);
        System.out.println(number);
    }

    public static int getSecondLargestNumber(int[] numbers) {
        int maxNumber = numbers[0];
        int secondLargest = numbers [0];
        for(int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                secondLargest = maxNumber;
                maxNumber = numbers[i];
            }
        }
        return secondLargest;
    }
}
