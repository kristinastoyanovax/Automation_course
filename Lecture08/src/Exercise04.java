//Write a Java method to count all words in a string.

public class Exercise04 {
    public static void main(String[] args) {
    int finalCount = countWords("java sucks very much".trim());
        System.out.println(finalCount);
    }

    public static int countWords(String a) {
        int nOfSpaces = 0;
        for(int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                nOfSpaces++;
            }
        }
        if (a.isEmpty()) {
            return 0;
        }
        if (!a.isEmpty() && nOfSpaces == 0) {
            return 1;
        }
        return nOfSpaces + 1;
    }
}
