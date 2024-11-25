import java.util.Arrays;

//Create a class named Student with two attributes: one for the student's
//name and one for their grades. Add a method to the Student class that
//calculates and returns the average of the grades. Create student objects,
//each with a unique name and a set of grades. Print each student's name
//along with their average grade.
public class Student {
    String studentName;
    int[] grades;


    public Student (String studentName, int[] grades) {
        this.studentName = studentName;
        this.grades = grades;
    }

    public float calcAverageGrade() {
        int sum = 0;
        for(int i = 0; i < grades.length; i++){
            sum += grades[i];
        }
        return (float) sum / grades.length;
    }

    @Override
    public String toString() {
        return "Student name - " + studentName +
                ", grades = " + calcAverageGrade();
    }
}
