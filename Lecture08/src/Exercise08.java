/*
Write a method named isEven that accepts an int argument. The method
should return true if the argument is even, or false otherwise
 */
public class Exercise08 {
    public static void main(String[] args) {
        if(isEven(3)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
