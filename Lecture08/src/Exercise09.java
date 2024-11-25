/*
A takes as input a non-negative integer and returns true if the number is a
palindrome. Non-negative integer is called a palindrome if it reads forward
and backward in the same way. For example, the numbers 5, 121, 3443,
and 123454321 are palindromes.

int to array
loop to go over array
compare opposing indexes
stop when left index is higher than the right one
 */
public class Exercise09 {
    public static void main(String[] args) {
            if(checkIfPalindrome(12321)) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

    public static boolean checkIfPalindrome(int number) {
        if (number < 0) {
            System.out.println("Only positive number can be accepted as input. Please enter a different number.");
            return false;
        }
        String convertedNumber = Integer.toString(number);
        int leftI = 0;
        int rightI = convertedNumber.length() - 1;
        while (leftI < rightI) {
            if(convertedNumber.charAt(leftI) != convertedNumber.charAt(rightI)) {
               return false;
            }
            leftI++;
            rightI--;
        }
        return true;
    }
}
