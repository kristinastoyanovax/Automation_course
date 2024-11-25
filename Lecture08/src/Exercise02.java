//Write a Java method to compute the average of three numbers.

public class Exercise02 {
    public static void main(String[] args) {
        float averageOfNumbers = getAverage(3,2,5);
        System.out.println("The average of the numbers is: " + averageOfNumbers);
    }

    public static float getAverage(int number1, int number2, int number3) {
        return (float) (number1 + number2 + number3) / 3;
    }
}
