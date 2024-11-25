/*
Write a Java method to display the middle character of a string:
a) If the length of the string is even there will be two middle characters.
b) If the length of the string is odd there will be one middle character.

aba
index - 1,
abba
0123
word.length() / 2 = 2
2 - 1
2


 */
public class Exercise03 {
    public static void main(String[] args) {
        displayCharacters("abc");
    }

    public static void displayCharacters(String word) {
        if(word.length() % 2 == 0) {
            int index1 = word.length() / 2;
            int index2 = index1 - 1;
            System.out.println(word.charAt(index2) + " " + word.charAt(index1));
            System.out.println("Is even");
        }
        else {
            int index1 = word.length() / 2;
            System.out.println(word.charAt(index1));
            System.out.println("Not even");
        }
    }
}
