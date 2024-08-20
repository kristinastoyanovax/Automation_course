/*
Reverse the following list using for loop list1 = [10, 20, 30, 40, 50]
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Exercise03 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList (10, 20, 30, 40, 50).reversed();
        for (int i = 0; i < list1.size(); i++){
            System.out.println("Reversed order of the list: " + list1.get(i));
        }
    }
}
