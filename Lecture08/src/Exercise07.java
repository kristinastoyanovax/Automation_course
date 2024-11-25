/*
Write a Java method to display the last character of a string. If the string is
empty, display a message indicating that there is no last character.

abcd
0123
 */
public class Exercise07 {
    public static void main(String[] args) {
        displayLastCharacter("d".trim());
    }

    public static void displayLastCharacter(String a) {
        if (a.isEmpty()) {
            System.out.println("There is no last character");
        }
        else {
            System.out.print( a.charAt(a.length() - 1));
        }
    }
}
