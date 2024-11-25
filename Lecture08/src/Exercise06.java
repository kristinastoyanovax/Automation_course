import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Write a Java method to remove duplicate elements from an array of
numbers and return a new array with only unique elements.

loop to go through the array
if - checking if the current element is the same as the previous one
remove the current element if it's the same as the previous one
 */
public class Exercise06 {
    public static void main(String[] args) {
        int[] array = {1,1,3,6,8,9,8,10,3};
        Integer[] arrayWNoDuplicates = removeDuplicates(array);
        System.out.println(Arrays.toString(arrayWNoDuplicates));
    }

    public static Integer[] removeDuplicates(int[] arrayNumbers) {
        Set<Integer> setOfNumbers = new HashSet<>();
        for(int i = 1; i < arrayNumbers.length; i++) {
            setOfNumbers.add(arrayNumbers[i]);
        }
        return setOfNumbers.toArray(new Integer[0]);
    }
}
