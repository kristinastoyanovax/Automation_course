/*
Write a function that checks how many times the digit "5" is used in a number.
Example:
Input: 125458951
Output: "5" is used 3 times
 */
public class Main01 {
    public static void main(String[] args) {
       int finalCount = occurrenceOf5(125458951);
        System.out.println("\"5\" is used " + finalCount + " times");
    }

    /**
     * Counts the occurrences of 5 by converting to String and comparing against '5';
     * @param number the number we are checking;
     * @return the number of times 5 occurs in the provided number;
     */
    private static int occurrenceOf5(int number) {
        String convertedNumber = Integer.toString(number);
        int occurrences = 0;
        for (int i = 0; i < convertedNumber.length(); i++) {
            if (convertedNumber.charAt(i) == '5') {
                occurrences++;
            }
        }
        return occurrences;
    }
}
