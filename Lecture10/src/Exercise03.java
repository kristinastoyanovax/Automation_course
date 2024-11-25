import java.util.Scanner;

/*
Create a method that takes a user's age as an input and validates it. The
method should throw an exception if the age is not within a valid range (0
to 120). Additionally, create another method that calls this validation
method and handles the thrown exception. Use throws in the method
signature to indicate that the exception might be thrown.
 */
public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = getAge(scanner.nextInt());
        System.out.println("Age: " + result);
    }

    public static int getAge(int age) throws IllegalArgumentException {
        getAgeValidator(age);
        return age;
    }

    public static void getAgeValidator(int age) {
        if (0 > age || age > 120){
            throw new IllegalArgumentException("Age is not within a valid range");
        }
    }
}
