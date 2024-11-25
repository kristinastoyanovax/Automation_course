import java.util.Scanner;

/*
Print elements of a given 2-d matrix with dynamic rows and
columns taken from user input
 */
public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] matrix = new int [rows][col];
        for(int row = 0; row < matrix.length; row++){
            for(int i = 0; i < matrix.length; i++) {
                matrix[row][i] = scanner.nextInt();
            }
        }
        for(int row = 0; row < matrix.length; row++){
            for(int i = 0; i < matrix.length; i++) {
                System.out.println(matrix[row][i]);
            }
        }
    }
}
