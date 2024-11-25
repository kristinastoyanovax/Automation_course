//Print elements of a given 2-d matrix with 4 rows and 3 columns
public class Exercise02 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };
        for (int row = 0; row < matrix.length; row++) {
            System.out.print("[ ");
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println("]");
        }
    }
}
