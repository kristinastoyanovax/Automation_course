import java.util.Scanner;
/*
Write a program which calculates if a triangle can be built by 3 given angles. The
angles are taken from the user input. There are two possible outputs – if the triangle
can’t be built based on the angle values or the triangle can be built based on the angle
values. If the triangle is possible the output should contain also the type of the triangle
– acute (остроъгълен), right-angled (правоъгълен), obtuse (тъпоъгълен), equilateral
(равностранен), isosceles (равнобедрен), multifaceted (разностранен).
 */
public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angleA = scanner.nextInt();
        int angleB = scanner.nextInt();
        int angleC = scanner.nextInt();
        if (angleA + angleB + angleC == 180) {
            if (angleA == 90 || angleB == 90 || angleC == 90) {
                System.out.println("Triangle is right-angled");
            } else if (angleA > 90 || angleB > 90 || angleC > 90) {
                System.out.println("Triangle is obtuse");
            } else if (angleA == angleB && angleB == angleC) {
                System.out.println("Triangle is equilateral");
            } else if (angleA == angleB || angleB == angleC || angleA == angleC) {
                System.out.println("Triangle is isosceles");
            } else if (angleA != angleB && angleB != angleC && angleA != angleC) {
                System.out.println("Triangle is multifaceted");
            } else if (angleA < 90 || angleB < 90 || angleC < 90) {
                System.out.println("Triangle is acute");
            }
        }else {
            System.out.println("Triangle can’t be built");}
    }
}