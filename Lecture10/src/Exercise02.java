/*
File Reading and Parsing - You need to write a Java program that reads an
integer from a file and parses it to calculate the square root. If the file
cannot be found (FileNotFoundException) or if the content of the file is not
a valid integer(NumberFormatException), handle these exceptions
appropriately and print messages to the user. Hint

1. wzema faila
2. zarejda go w skenera
3. minawa prez fail dokato ima sledwashto chislo
4. chetem faila red po red
5. parswame string to int
6. calculate square root
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Exercise02 {
    public static void main(String[] args) {
        try{
            File newFile = new File("/Users/kristina/Documents/Skillo/Lecture10/out/production/Lecture10/data.txt");
            Scanner myReader = new Scanner(newFile);
            while (myReader.hasNextLine()){
              String currentLine = myReader.nextLine();
              int currentNumber = Integer.parseInt(currentLine);
              double squareRoot = sqrt(currentNumber);
                System.out.println(squareRoot);
            }
        }
        catch (FileNotFoundException fileNotFound) {
            System.out.println("File not found");
        }
        catch (NumberFormatException invalidFormat) {
            System.out.println("Invalid format");
        }
    }
}
