/*
Given a list iterate it and display numbers which are divisible by 5 and if you
find number greater than 150 stop the loop iteration list1 = [12, 15, 32, 42,
55, 75, 122, 132, 150, 180, 200]
 */
public class Exercise02 {
    public static void main(String[] args) {
        int[] list1 = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        for (int i = 0; i < list1.length; i++) {
            int number = list1[i];
            if (number % 5 == 0) {
                System.out.println("Numbers divisible by 5: " + number);
            }
            if (number > 150 ){
                break;
            }
        }
    }
}
