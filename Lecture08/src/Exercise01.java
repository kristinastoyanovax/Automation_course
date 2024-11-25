//Write a Java method to find the smallest number among three numbers
// 1, 5, 9
/*

 */
public class Exercise01 {
    public static void main(String[] args) {
        int number =  findSmallestNumber(7,5,4);
        System.out.println("The smallest number is: " + number);
    }

    public static int findSmallestNumber(int number1, int number2, int number3) {
        if (number1 < number2 && number1 < number3) {
            return number1;
        } else if (number2 < number1 && number2 < number3) {
            return number2;
        }
        else {
            return number3;
        }
    }
}
